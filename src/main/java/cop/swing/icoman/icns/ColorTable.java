package cop.swing.icoman.icns;

import cop.swing.icoman.imageio.bmp.Bitmap;

/**
 * @author Oleg Cherednik
 * @since 31.08.2015
 */
final class ColorTable {
    public static final int[] BIT_1_2 = {
            Bitmap.rgb(0xFF, 0xFF, 0xFF),
            Bitmap.rgb(0x0, 0x0, 0x0)
    };

    public static final int[] BIT_4_16 = {
            Bitmap.rgb(255, 255, 255),
            Bitmap.rgb(252, 243, 5),
            Bitmap.rgb(255, 100, 2),
            Bitmap.rgb(221, 8, 6),
            Bitmap.rgb(242, 8, 132),
            Bitmap.rgb(70, 0, 165),
            Bitmap.rgb(0, 0, 212),
            Bitmap.rgb(2, 171, 234),
            Bitmap.rgb(31, 183, 20),
            Bitmap.rgb(0, 100, 17),
            Bitmap.rgb(86, 44, 5),
            Bitmap.rgb(0x90, 0x71, 0x3A),
            Bitmap.rgb(0xC0, 0xC0, 0xC0),
            Bitmap.rgb(0x80, 0x80, 0x80),
            Bitmap.rgb(0x40, 0x40, 0x40),
            Bitmap.rgb(0x00, 0x00, 0x00)
    };

    public static final int[] BIT_8_256 = {
            Bitmap.rgb(0x00, 0x00, 0x00),
            Bitmap.rgb(0x11, 0x11, 0x11),
            Bitmap.rgb(0x22, 0x22, 0x22),
            Bitmap.rgb(0x44, 0x44, 0x44),
            Bitmap.rgb(0x55, 0x55, 0x55),
            Bitmap.rgb(0x77, 0x77, 0x77),
            Bitmap.rgb(0x88, 0x88, 0x88),
            Bitmap.rgb(0xAA, 0xAA, 0xAA),
            Bitmap.rgb(0xBB, 0xBB, 0xBB),
            Bitmap.rgb(0xDD, 0xDD, 0xDD),
            Bitmap.rgb(0xEE, 0xEE, 0xEE),
            Bitmap.rgb(0x00, 0x00, 0x11),
            Bitmap.rgb(0x00, 0x00, 0x22),
            Bitmap.rgb(0x00, 0x00, 0x44),
            Bitmap.rgb(0x00, 0x00, 0x55),
            Bitmap.rgb(0x00, 0x00, 0x77),
            Bitmap.rgb(0x00, 0x00, 0x88),
            Bitmap.rgb(0x00, 0x00, 0xAA),
            Bitmap.rgb(0x00, 0x00, 0xBB),
            Bitmap.rgb(0x00, 0x00, 0xDD),
            Bitmap.rgb(0x00, 0x00, 0xEE),
            Bitmap.rgb(0x00, 0x11, 0x00),
            Bitmap.rgb(0x00, 0x22, 0x00),
            Bitmap.rgb(0x00, 0x44, 0x00),
            Bitmap.rgb(0x00, 0x55, 0x00),
            Bitmap.rgb(0x00, 0x77, 0x00),
            Bitmap.rgb(0x00, 0x88, 0x00),
            Bitmap.rgb(0x00, 0xAA, 0x00),
            Bitmap.rgb(0x00, 0xBB, 0x00),
            Bitmap.rgb(0x00, 0xDD, 0x00),
            Bitmap.rgb(0x00, 0xEE, 0x00),
            Bitmap.rgb(0x11, 0x00, 0x00),
            Bitmap.rgb(0x22, 0x00, 0x00),
            Bitmap.rgb(0x44, 0x00, 0x00),
            Bitmap.rgb(0x55, 0x00, 0x00),
            Bitmap.rgb(0x77, 0x00, 0x00),
            Bitmap.rgb(0x88, 0x00, 0x00),
            Bitmap.rgb(0xAA, 0x00, 0x00),
            Bitmap.rgb(0xBB, 0x00, 0x00),
            Bitmap.rgb(0xDD, 0x00, 0x00),
            Bitmap.rgb(0xEE, 0x00, 0x00),
            Bitmap.rgb(0x00, 0x00, 0x33),
            Bitmap.rgb(0x00, 0x00, 0x66),
            Bitmap.rgb(0x00, 0x00, 0x99),
            Bitmap.rgb(0x00, 0x00, 0xCC),
            Bitmap.rgb(0x00, 0x00, 0xFF),
            Bitmap.rgb(0x00, 0x33, 0x00),
            Bitmap.rgb(0x00, 0x33, 0x33),
            Bitmap.rgb(0x00, 0x33, 0x66),
            Bitmap.rgb(0x00, 0x33, 0x99),
            Bitmap.rgb(0x00, 0x33, 0xCC),
            Bitmap.rgb(0x00, 0x33, 0xFF),
            Bitmap.rgb(0x00, 0x66, 0x00),
            Bitmap.rgb(0x00, 0x66, 0x33),
            Bitmap.rgb(0x00, 0x66, 0x66),
            Bitmap.rgb(0x00, 0x66, 0x99),
            Bitmap.rgb(0x00, 0x66, 0xCC),
            Bitmap.rgb(0x00, 0x66, 0xFF),
            Bitmap.rgb(0x00, 0x99, 0x00),
            Bitmap.rgb(0x00, 0x99, 0x33),
            Bitmap.rgb(0x00, 0x99, 0x66),
            Bitmap.rgb(0x00, 0x99, 0x99),
            Bitmap.rgb(0x00, 0x99, 0xCC),
            Bitmap.rgb(0x00, 0x99, 0xFF),
            Bitmap.rgb(0x00, 0xCC, 0x00),
            Bitmap.rgb(0x00, 0xCC, 0x33),
            Bitmap.rgb(0x00, 0xCC, 0x66),
            Bitmap.rgb(0x00, 0xCC, 0x99),
            Bitmap.rgb(0x00, 0xCC, 0xCC),
            Bitmap.rgb(0x00, 0xCC, 0xFF),
            Bitmap.rgb(0x00, 0xFF, 0x00),
            Bitmap.rgb(0x00, 0xFF, 0x33),
            Bitmap.rgb(0x00, 0xFF, 0x66),
            Bitmap.rgb(0x00, 0xFF, 0x99),
            Bitmap.rgb(0x00, 0xFF, 0xCC),
            Bitmap.rgb(0x00, 0xFF, 0xFF),
            Bitmap.rgb(0x33, 0x00, 0x00),
            Bitmap.rgb(0x33, 0x00, 0x33),
            Bitmap.rgb(0x33, 0x00, 0x66),
            Bitmap.rgb(0x33, 0x00, 0x99),
            Bitmap.rgb(0x33, 0x00, 0xCC),
            Bitmap.rgb(0x33, 0x00, 0xFF),
            Bitmap.rgb(0x33, 0x33, 0x00),
            Bitmap.rgb(0x33, 0x33, 0x33),
            Bitmap.rgb(0x33, 0x33, 0x66),
            Bitmap.rgb(0x33, 0x33, 0x99),
            Bitmap.rgb(0x33, 0x33, 0xCC),
            Bitmap.rgb(0x33, 0x33, 0xFF),
            Bitmap.rgb(0x33, 0x66, 0x00),
            Bitmap.rgb(0x33, 0x66, 0x33),
            Bitmap.rgb(0x33, 0x66, 0x66),
            Bitmap.rgb(0x33, 0x66, 0x99),
            Bitmap.rgb(0x33, 0x66, 0xCC),
            Bitmap.rgb(0x33, 0x66, 0xFF),
            Bitmap.rgb(0x33, 0x99, 0x00),
            Bitmap.rgb(0x33, 0x99, 0x33),
            Bitmap.rgb(0x33, 0x99, 0x66),
            Bitmap.rgb(0x33, 0x99, 0x99),
            Bitmap.rgb(0x33, 0x99, 0xCC),
            Bitmap.rgb(0x33, 0x99, 0xFF),
            Bitmap.rgb(0x33, 0xCC, 0x00),
            Bitmap.rgb(0x33, 0xCC, 0x33),
            Bitmap.rgb(0x33, 0xCC, 0x66),
            Bitmap.rgb(0x33, 0xCC, 0x99),
            Bitmap.rgb(0x33, 0xCC, 0xCC),
            Bitmap.rgb(0x33, 0xCC, 0xFF),
            Bitmap.rgb(0x33, 0xFF, 0x00),
            Bitmap.rgb(0x33, 0xFF, 0x33),
            Bitmap.rgb(0x33, 0xFF, 0x66),
            Bitmap.rgb(0x33, 0xFF, 0x99),
            Bitmap.rgb(0x33, 0xFF, 0xCC),
            Bitmap.rgb(0x33, 0xFF, 0xFF),
            Bitmap.rgb(0x66, 0x00, 0x00),
            Bitmap.rgb(0x66, 0x00, 0x33),
            Bitmap.rgb(0x66, 0x00, 0x66),
            Bitmap.rgb(0x66, 0x00, 0x99),
            Bitmap.rgb(0x66, 0x00, 0xCC),
            Bitmap.rgb(0x66, 0x00, 0xFF),
            Bitmap.rgb(0x66, 0x33, 0x00),
            Bitmap.rgb(0x66, 0x33, 0x33),
            Bitmap.rgb(0x66, 0x33, 0x66),
            Bitmap.rgb(0x66, 0x33, 0x99),
            Bitmap.rgb(0x66, 0x33, 0xCC),
            Bitmap.rgb(0x66, 0x33, 0xFF),
            Bitmap.rgb(0x66, 0x66, 0x00),
            Bitmap.rgb(0x66, 0x66, 0x33),
            Bitmap.rgb(0x66, 0x66, 0x66),
            Bitmap.rgb(0x66, 0x66, 0x99),
            Bitmap.rgb(0x66, 0x66, 0xCC),
            Bitmap.rgb(0x66, 0x66, 0xFF),
            Bitmap.rgb(0x66, 0x99, 0x00),
            Bitmap.rgb(0x66, 0x99, 0x33),
            Bitmap.rgb(0x66, 0x99, 0x66),
            Bitmap.rgb(0x66, 0x99, 0x99),
            Bitmap.rgb(0x66, 0x99, 0xCC),
            Bitmap.rgb(0x66, 0x99, 0xFF),
            Bitmap.rgb(0x66, 0xCC, 0x00),
            Bitmap.rgb(0x66, 0xCC, 0x33),
            Bitmap.rgb(0x66, 0xCC, 0x66),
            Bitmap.rgb(0x66, 0xCC, 0x99),
            Bitmap.rgb(0x66, 0xCC, 0xCC),
            Bitmap.rgb(0x66, 0xCC, 0xFF),
            Bitmap.rgb(0x66, 0xFF, 0x00),
            Bitmap.rgb(0x66, 0xFF, 0x33),
            Bitmap.rgb(0x66, 0xFF, 0x66),
            Bitmap.rgb(0x66, 0xFF, 0x99),
            Bitmap.rgb(0x66, 0xFF, 0xCC),
            Bitmap.rgb(0x66, 0xFF, 0xFF),
            Bitmap.rgb(0x99, 0x00, 0x00),
            Bitmap.rgb(0x99, 0x00, 0x33),
            Bitmap.rgb(0x99, 0x00, 0x66),
            Bitmap.rgb(0x99, 0x00, 0x99),
            Bitmap.rgb(0x99, 0x00, 0xCC),
            Bitmap.rgb(0x99, 0x00, 0xFF),
            Bitmap.rgb(0x99, 0x33, 0x00),
            Bitmap.rgb(0x99, 0x33, 0x33),
            Bitmap.rgb(0x99, 0x33, 0x66),
            Bitmap.rgb(0x99, 0x33, 0x99),
            Bitmap.rgb(0x99, 0x33, 0xCC),
            Bitmap.rgb(0x99, 0x33, 0xFF),
            Bitmap.rgb(0x99, 0x66, 0x00),
            Bitmap.rgb(0x99, 0x66, 0x33),
            Bitmap.rgb(0x99, 0x66, 0x66),
            Bitmap.rgb(0x99, 0x66, 0x99),
            Bitmap.rgb(0x99, 0x66, 0xCC),
            Bitmap.rgb(0x99, 0x66, 0xFF),
            Bitmap.rgb(0x99, 0x99, 0x00),
            Bitmap.rgb(0x99, 0x99, 0x33),
            Bitmap.rgb(0x99, 0x99, 0x66),
            Bitmap.rgb(0x99, 0x99, 0x99),
            Bitmap.rgb(0x99, 0x99, 0xCC),
            Bitmap.rgb(0x99, 0x99, 0xFF),
            Bitmap.rgb(0x99, 0xCC, 0x00),
            Bitmap.rgb(0x99, 0xCC, 0x33),
            Bitmap.rgb(0x99, 0xCC, 0x66),
            Bitmap.rgb(0x99, 0xCC, 0x99),
            Bitmap.rgb(0x99, 0xCC, 0xCC),
            Bitmap.rgb(0x99, 0xCC, 0xFF),
            Bitmap.rgb(0x99, 0xFF, 0x00),
            Bitmap.rgb(0x99, 0xFF, 0x33),
            Bitmap.rgb(0x99, 0xFF, 0x66),
            Bitmap.rgb(0x99, 0xFF, 0x99),
            Bitmap.rgb(0x99, 0xFF, 0xCC),
            Bitmap.rgb(0x99, 0xFF, 0xFF),
            Bitmap.rgb(0xCC, 0x00, 0x00),
            Bitmap.rgb(0xCC, 0x00, 0x33),
            Bitmap.rgb(0xCC, 0x00, 0x66),
            Bitmap.rgb(0xCC, 0x00, 0x99),
            Bitmap.rgb(0xCC, 0x00, 0xCC),
            Bitmap.rgb(0xCC, 0x00, 0xFF),
            Bitmap.rgb(0xCC, 0x33, 0x00),
            Bitmap.rgb(0xCC, 0x33, 0x33),
            Bitmap.rgb(0xCC, 0x33, 0x66),
            Bitmap.rgb(0xCC, 0x33, 0x99),
            Bitmap.rgb(0xCC, 0x33, 0xCC),
            Bitmap.rgb(0xCC, 0x33, 0xFF),
            Bitmap.rgb(0xCC, 0x66, 0x00),
            Bitmap.rgb(0xCC, 0x66, 0x33),
            Bitmap.rgb(0xCC, 0x66, 0x66),
            Bitmap.rgb(0xCC, 0x66, 0x99),
            Bitmap.rgb(0xCC, 0x66, 0xCC),
            Bitmap.rgb(0xCC, 0x66, 0xFF),
            Bitmap.rgb(0xCC, 0x99, 0x00),
            Bitmap.rgb(0xCC, 0x99, 0x33),
            Bitmap.rgb(0xCC, 0x99, 0x66),
            Bitmap.rgb(0xCC, 0x99, 0x99),
            Bitmap.rgb(0xCC, 0x99, 0xCC),
            Bitmap.rgb(0xCC, 0x99, 0xFF),
            Bitmap.rgb(0xCC, 0xCC, 0x00),
            Bitmap.rgb(0xCC, 0xCC, 0x33),
            Bitmap.rgb(0xCC, 0xCC, 0x66),
            Bitmap.rgb(0xCC, 0xCC, 0x99),
            Bitmap.rgb(0xCC, 0xCC, 0xCC),
            Bitmap.rgb(0xCC, 0xCC, 0xFF),
            Bitmap.rgb(0xCC, 0xFF, 0x00),
            Bitmap.rgb(0xCC, 0xFF, 0x33),
            Bitmap.rgb(0xCC, 0xFF, 0x66),
            Bitmap.rgb(0xCC, 0xFF, 0x99),
            Bitmap.rgb(0xCC, 0xFF, 0xCC),
            Bitmap.rgb(0xCC, 0xFF, 0xFF),
            Bitmap.rgb(0xFF, 0x00, 0x00),
            Bitmap.rgb(0xFF, 0x00, 0x33),
            Bitmap.rgb(0xFF, 0x00, 0x66),
            Bitmap.rgb(0xFF, 0x00, 0x99),
            Bitmap.rgb(0xFF, 0x00, 0xCC),
            Bitmap.rgb(0xFF, 0x00, 0xFF),
            Bitmap.rgb(0xFF, 0x33, 0x00),
            Bitmap.rgb(0xFF, 0x33, 0x33),
            Bitmap.rgb(0xFF, 0x33, 0x66),
            Bitmap.rgb(0xFF, 0x33, 0x99),
            Bitmap.rgb(0xFF, 0x33, 0xCC),
            Bitmap.rgb(0xFF, 0x33, 0xFF),
            Bitmap.rgb(0xFF, 0x66, 0x00),
            Bitmap.rgb(0xFF, 0x66, 0x33),
            Bitmap.rgb(0xFF, 0x66, 0x66),
            Bitmap.rgb(0xFF, 0x66, 0x99),
            Bitmap.rgb(0xFF, 0x66, 0xCC),
            Bitmap.rgb(0xFF, 0x66, 0xFF),
            Bitmap.rgb(0xFF, 0x99, 0x00),
            Bitmap.rgb(0xFF, 0x99, 0x33),
            Bitmap.rgb(0xFF, 0x99, 0x66),
            Bitmap.rgb(0xFF, 0x99, 0x99),
            Bitmap.rgb(0xFF, 0x99, 0xCC),
            Bitmap.rgb(0xFF, 0x99, 0xFF),
            Bitmap.rgb(0xFF, 0xCC, 0x00),
            Bitmap.rgb(0xFF, 0xCC, 0x33),
            Bitmap.rgb(0xFF, 0xCC, 0x66),
            Bitmap.rgb(0xFF, 0xCC, 0x99),
            Bitmap.rgb(0xFF, 0xCC, 0xCC),
            Bitmap.rgb(0xFF, 0xCC, 0xFF),
            Bitmap.rgb(0xFF, 0xFF, 0x00),
            Bitmap.rgb(0xFF, 0xFF, 0x33),
            Bitmap.rgb(0xFF, 0xFF, 0x66),
            Bitmap.rgb(0xFF, 0xFF, 0x99),
            Bitmap.rgb(0xFF, 0xFF, 0xCC),
            Bitmap.rgb(0xFF, 0xFF, 0xFF)
    };


    /*private static final int BIT_8_256[] = {
            rgb(0xFF, 0xFF, 0xFF),
            rgb(0xFF, 0xFF, 0xCC),
            rgb(0xFF, 0xFF, 0x99),
            rgb(0xFF, 0xFF, 0x66),
            rgb(0xFF, 0xFF, 0x33),
            rgb(0xFF, 0xFF, 0x00),
            rgb(0xFF, 0xCC, 0xFF),
            rgb(0xFF, 0xCC, 0xCC),
            rgb(0xFF, 0xCC, 0x99),
            rgb(0xFF, 0xCC, 0x66),
            rgb(0xFF, 0xCC, 0x33),
            rgb(0xFF, 0xCC, 0x00),
            rgb(0xFF, 0x99, 0xFF),
            rgb(0xFF, 0x99, 0xCC),
            rgb(0xFF, 0x99, 0x99),
            rgb(0xFF, 0x99, 0x66),
            rgb(0xFF, 0x99, 0x33),
            rgb(0xFF, 0x99, 0x00),
            rgb(0xFF, 0x66, 0xFF),
            rgb(0xFF, 0x66, 0xCC),
            rgb(0xFF, 0x66, 0x99),
            rgb(0xFF, 0x66, 0x66),
            rgb(0xFF, 0x66, 0x33),
            rgb(0xFF, 0x66, 0x00),
            rgb(0xFF, 0x33, 0xFF),
            rgb(0xFF, 0x33, 0xCC),
            rgb(0xFF, 0x33, 0x99),
            rgb(0xFF, 0x33, 0x66),
            rgb(0xFF, 0x33, 0x33),
            rgb(0xFF, 0x33, 0x00),
            rgb(0xFF, 0x00, 0xFF),
            rgb(0xFF, 0x00, 0xCC),
            rgb(0xFF, 0x00, 0x99),
            rgb(0xFF, 0x00, 0x66),
            rgb(0xFF, 0x00, 0x33),
            rgb(0xFF, 0x00, 0x00),
            rgb(0xCC, 0xFF, 0xFF),
            rgb(0xCC, 0xFF, 0xCC),
            rgb(0xCC, 0xFF, 0x99),
            rgb(0xCC, 0xFF, 0x66),
            rgb(0xCC, 0xFF, 0x33),
            rgb(0xCC, 0xFF, 0x00),
            rgb(0xCC, 0xCC, 0xFF),
            rgb(0xCC, 0xCC, 0xCC),
            rgb(0xCC, 0xCC, 0x99),
            rgb(0xCC, 0xCC, 0x66),
            rgb(0xCC, 0xCC, 0x33),
            rgb(0xCC, 0xCC, 0x00),
            rgb(0xCC, 0x99, 0xFF),
            rgb(0xCC, 0x99, 0xCC),
            rgb(0xCC, 0x99, 0x99),
            rgb(0xCC, 0x99, 0x66),
            rgb(0xCC, 0x99, 0x33),
            rgb(0xCC, 0x99, 0x00),
            rgb(0xCC, 0x66, 0xFF),
            rgb(0xCC, 0x66, 0xCC),
            rgb(0xCC, 0x66, 0x99),
            rgb(0xCC, 0x66, 0x66),
            rgb(0xCC, 0x66, 0x33),
            rgb(0xCC, 0x66, 0x00),
            rgb(0xCC, 0x33, 0xFF),
            rgb(0xCC, 0x33, 0xCC),
            rgb(0xCC, 0x33, 0x99),
            rgb(0xCC, 0x33, 0x66),
            rgb(0xCC, 0x33, 0x33),
            rgb(0xCC, 0x33, 0x00),
            rgb(0xCC, 0x00, 0xFF),
            rgb(0xCC, 0x00, 0xCC),
            rgb(0xCC, 0x00, 0x99),
            rgb(0xCC, 0x00, 0x66),
            rgb(0xCC, 0x00, 0x33),
            rgb(0xCC, 0x00, 0x00),
            rgb(0x99, 0xFF, 0xFF),
            rgb(0x99, 0xFF, 0xCC),
            rgb(0x99, 0xFF, 0x99),
            rgb(0x99, 0xFF, 0x66),
            rgb(0x99, 0xFF, 0x33),
            rgb(0x99, 0xFF, 0x00),
            rgb(0x99, 0xCC, 0xFF),
            rgb(0x99, 0xCC, 0xCC),
            rgb(0x99, 0xCC, 0x99),
            rgb(0x99, 0xCC, 0x66),
            rgb(0x99, 0xCC, 0x33),
            rgb(0x99, 0xCC, 0x00),
            rgb(0x99, 0x99, 0xFF),
            rgb(0x99, 0x99, 0xCC),
            rgb(0x99, 0x99, 0x99),
            rgb(0x99, 0x99, 0x66),
            rgb(0x99, 0x99, 0x33),
            rgb(0x99, 0x99, 0x00),
            rgb(0x99, 0x66, 0xFF),
            rgb(0x99, 0x66, 0xCC),
            rgb(0x99, 0x66, 0x99),
            rgb(0x99, 0x66, 0x66),
            rgb(0x99, 0x66, 0x33),
            rgb(0x99, 0x66, 0x00),
            rgb(0x99, 0x33, 0xFF),
            rgb(0x99, 0x33, 0xCC),
            rgb(0x99, 0x33, 0x99),
            rgb(0x99, 0x33, 0x66),
            rgb(0x99, 0x33, 0x33),
            rgb(0x99, 0x33, 0x00),
            rgb(0x99, 0x00, 0xFF),
            rgb(0x99, 0x00, 0xCC),
            rgb(0x99, 0x00, 0x99),
            rgb(0x99, 0x00, 0x66),
            rgb(0x99, 0x00, 0x33),
            rgb(0x99, 0x00, 0x00),
            rgb(0x66, 0xFF, 0xFF),
            rgb(0x66, 0xFF, 0xCC),
            rgb(0x66, 0xFF, 0x99),
            rgb(0x66, 0xFF, 0x66),
            rgb(0x66, 0xFF, 0x33),
            rgb(0x66, 0xFF, 0x00),
            rgb(0x66, 0xCC, 0xFF),
            rgb(0x66, 0xCC, 0xCC),
            rgb(0x66, 0xCC, 0x99),
            rgb(0x66, 0xCC, 0x66),
            rgb(0x66, 0xCC, 0x33),
            rgb(0x66, 0xCC, 0x00),
            rgb(0x66, 0x99, 0xFF),
            rgb(0x66, 0x99, 0xCC),
            rgb(0x66, 0x99, 0x99),
            rgb(0x66, 0x99, 0x66),
            rgb(0x66, 0x99, 0x33),
            rgb(0x66, 0x99, 0x00),
            rgb(0x66, 0x66, 0xFF),
            rgb(0x66, 0x66, 0xCC),
            rgb(0x66, 0x66, 0x99),
            rgb(0x66, 0x66, 0x66),
            rgb(0x66, 0x66, 0x33),
            rgb(0x66, 0x66, 0x00),
            rgb(0x66, 0x33, 0xFF),
            rgb(0x66, 0x33, 0xCC),
            rgb(0x66, 0x33, 0x99),
            rgb(0x66, 0x33, 0x66),
            rgb(0x66, 0x33, 0x33),
            rgb(0x66, 0x33, 0x00),
            rgb(0x66, 0x00, 0xFF),
            rgb(0x66, 0x00, 0xCC),
            rgb(0x66, 0x00, 0x99),
            rgb(0x66, 0x00, 0x66),
            rgb(0x66, 0x00, 0x33),
            rgb(0x66, 0x00, 0x00),
            rgb(0x33, 0xFF, 0xFF),
            rgb(0x33, 0xFF, 0xCC),
            rgb(0x33, 0xFF, 0x99),
            rgb(0x33, 0xFF, 0x66),
            rgb(0x33, 0xFF, 0x33),
            rgb(0x33, 0xFF, 0x00),
            rgb(0x33, 0xCC, 0xFF),
            rgb(0x33, 0xCC, 0xCC),
            rgb(0x33, 0xCC, 0x99),
            rgb(0x33, 0xCC, 0x66),
            rgb(0x33, 0xCC, 0x33),
            rgb(0x33, 0xCC, 0x00),
            rgb(0x33, 0x99, 0xFF),
            rgb(0x33, 0x99, 0xCC),
            rgb(0x33, 0x99, 0x99),
            rgb(0x33, 0x99, 0x66),
            rgb(0x33, 0x99, 0x33),
            rgb(0x33, 0x99, 0x00),
            rgb(0x33, 0x66, 0xFF),
            rgb(0x33, 0x66, 0xCC),
            rgb(0x33, 0x66, 0x99),
            rgb(0x33, 0x66, 0x66),
            rgb(0x33, 0x66, 0x33),
            rgb(0x33, 0x66, 0x00),
            rgb(0x33, 0x33, 0xFF),
            rgb(0x33, 0x33, 0xCC),
            rgb(0x33, 0x33, 0x99),
            rgb(0x33, 0x33, 0x66),
            rgb(0x33, 0x33, 0x33),
            rgb(0x33, 0x33, 0x00),
            rgb(0x33, 0x00, 0xFF),
            rgb(0x33, 0x00, 0xCC),
            rgb(0x33, 0x00, 0x99),
            rgb(0x33, 0x00, 0x66),
            rgb(0x33, 0x00, 0x33),
            rgb(0x33, 0x00, 0x00),
            rgb(0x00, 0xFF, 0xFF),
            rgb(0x00, 0xFF, 0xCC),
            rgb(0x00, 0xFF, 0x99),
            rgb(0x00, 0xFF, 0x66),
            rgb(0x00, 0xFF, 0x33),
            rgb(0x00, 0xFF, 0x00),
            rgb(0x00, 0xCC, 0xFF),
            rgb(0x00, 0xCC, 0xCC),
            rgb(0x00, 0xCC, 0x99),
            rgb(0x00, 0xCC, 0x66),
            rgb(0x00, 0xCC, 0x33),
            rgb(0x00, 0xCC, 0x00),
            rgb(0x00, 0x99, 0xFF),
            rgb(0x00, 0x99, 0xCC),
            rgb(0x00, 0x99, 0x99),
            rgb(0x00, 0x99, 0x66),
            rgb(0x00, 0x99, 0x33),
            rgb(0x00, 0x99, 0x00),
            rgb(0x00, 0x66, 0xFF),
            rgb(0x00, 0x66, 0xCC),
            rgb(0x00, 0x66, 0x99),
            rgb(0x00, 0x66, 0x66),
            rgb(0x00, 0x66, 0x33),
            rgb(0x00, 0x66, 0x00),
            rgb(0x00, 0x33, 0xFF),
            rgb(0x00, 0x33, 0xCC),
            rgb(0x00, 0x33, 0x99),
            rgb(0x00, 0x33, 0x66),
            rgb(0x00, 0x33, 0x33),
            rgb(0x00, 0x33, 0x00),
            rgb(0x00, 0x00, 0xFF),
            rgb(0x00, 0x00, 0xCC),
            rgb(0x00, 0x00, 0x99),
            rgb(0x00, 0x00, 0x66),
            rgb(0x00, 0x00, 0x33),
            rgb(0xEE, 0x00, 0x00),
            rgb(0xDD, 0x00, 0x00),
            rgb(0xBB, 0x00, 0x00),
            rgb(0xAA, 0x00, 0x00),
            rgb(0x88, 0x00, 0x00),
            rgb(0x77, 0x00, 0x00),
            rgb(0x55, 0x00, 0x00),
            rgb(0x44, 0x00, 0x00),
            rgb(0x22, 0x00, 0x00),
            rgb(0x11, 0x00, 0x00),
            rgb(0x00, 0xEE, 0x00),
            rgb(0x00, 0xDD, 0x00),
            rgb(0x00, 0xBB, 0x00),
            rgb(0x00, 0xAA, 0x00),
            rgb(0x00, 0x88, 0x00),
            rgb(0x00, 0x77, 0x00),
            rgb(0x00, 0x55, 0x00),
            rgb(0x00, 0x44, 0x00),
            rgb(0x00, 0x22, 0x00),
            rgb(0x00, 0x11, 0x00),
            rgb(0x00, 0x00, 0xEE),
            rgb(0x00, 0x00, 0xDD),
            rgb(0x00, 0x00, 0xBB),
            rgb(0x00, 0x00, 0xAA),
            rgb(0x00, 0x00, 0x88),
            rgb(0x00, 0x00, 0x77),
            rgb(0x00, 0x00, 0x55),
            rgb(0x00, 0x00, 0x44),
            rgb(0x00, 0x00, 0x22),
            rgb(0x00, 0x00, 0x11),
            rgb(0xEE, 0xEE, 0xEE),
            rgb(0xDD, 0xDD, 0xDD),
            rgb(0xBB, 0xBB, 0xBB),
            rgb(0xAA, 0xAA, 0xAA),
            rgb(0x88, 0x88, 0x88),
            rgb(0x77, 0x77, 0x77),
            rgb(0x55, 0x55, 0x55),
            rgb(0x44, 0x44, 0x44),
            rgb(0x22, 0x22, 0x22),
            rgb(0x11, 0x11, 0x11),
            rgb(0x00, 0x00, 0x00)
    }; */


    private ColorTable() {
    }
}
