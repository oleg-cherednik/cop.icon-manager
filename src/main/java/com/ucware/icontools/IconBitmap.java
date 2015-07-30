package com.ucware.icontools;

import com.ucware.coff.A.IconFileImage;
import com.ucware.coff.Header;
import cop.swing.icoman.bitmap.BitmapInfoHeader;

import javax.imageio.stream.ImageInputStream;
import java.io.IOException;

public class IconBitmap {
    private BitmapInfoHeader header;
    private BitMask[] data;
    private byte[] bitMasks;
    private byte[] colorTable;

    public IconBitmap(IconFileImage e) {
//        this(e.getData());
    }

    public IconBitmap(ImageInputStream in) throws IOException {
        header = new BitmapInfoHeader(in);
        int width = header.getBiWidth();
        int height = header.getBiHeight() / 2;
        int bitCount = header.getBiBitCount();
        int size = bitCount <= 8 ? (int)Math.pow(2.0, bitCount) : 0;

        if (size > 0) {
            data = new BitMask[size];

            for (int i = 0; i < data.length; ++i)
                data[i] = Header.read(in, new BitMask());
        }

        bitMasks = new byte[(width * bitCount + 31) / 32 * 4 * height];
        colorTable = new byte[(width + 31) / 32 * 4 * height];
        in.read(bitMasks);
        in.read(colorTable);
    }

    public Bitmap getBitmap() {
        return null;
    }

    public BitmapInfoHeader getHeader() {
        return header;
    }

    public BitMask[] getData() {
        return data;
    }

    public byte[] getBitMasks() {
        return bitMasks;
    }

    public byte[] getColorTable() {
        return colorTable;
    }
}
