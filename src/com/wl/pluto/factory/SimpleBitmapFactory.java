package com.wl.pluto.factory;

public class SimpleBitmapFactory {


    public static Bitmap createResourceBitmap() {
        return new ResourceBitmap();
    }

    public static Bitmap createFileBitmap() {
        return new FileBitmap();
    }

    public static Bitmap createStreamBitmap() {
        return new StreamBitmap();
    }
}
