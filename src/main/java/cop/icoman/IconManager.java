package cop.icoman;

import cop.icoman.exceptions.IconDuplicationException;
import cop.icoman.exceptions.IconManagerException;
import cop.icoman.exceptions.IconNotFoundException;
import cop.icoman.icns.imageio.IcnsReaderSpi;
import cop.icoman.ico.imageio.IcoReaderSpi;
import org.apache.commons.lang3.StringUtils;

import javax.imageio.stream.ImageInputStream;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Oleg Cherednik
 * @since 01.09.2013
 */
public final class IconManager {
    private static final IconManager INSTANCE = new IconManager();

    private final Map<String, IconFile> icons = new LinkedHashMap<>();

    public static IconManager getInstance() {
        return INSTANCE;
    }

    static {
        IcoReaderSpi.register();
        IcnsReaderSpi.register();
    }

    private IconManager() {
    }

    public Set<String> getIds() {
        return icons.isEmpty() ? Collections.emptySet() : Collections.unmodifiableSet(icons.keySet());
    }

    @NotNull
    public IconFile addIcon(String id, ImageInputStream in) throws IconManagerException, IOException {
        if (in == null)
            throw new IOException(String.format("Resource '%s' doesn't exists", id));
        return addIcon(id, IconIO.read(in));
    }

    public IconFile addIcon(String id, IconFile icon) throws IconManagerException {
        if (StringUtils.isBlank(id) || icon == null)
            throw new IconManagerException("id/icon is not set");
        if (icons.containsKey(id))
            throw new IconDuplicationException(id);

        icons.put(id, icon);

        return icon;
    }

    public void removeIcon(String id) {
        icons.remove(id);
    }

    @NotNull
    public IconFile getIconFile(String id) throws IconNotFoundException {
        IconFile icon = icons.get(id);

        if (icon == null)
            throw new IconNotFoundException(id);

        return icon;
    }
}