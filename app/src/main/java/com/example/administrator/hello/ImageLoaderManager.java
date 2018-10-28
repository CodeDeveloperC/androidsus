package com.example.administrator.hello;

public class ImageLoaderManager {
    private static ImageLoaderManager mInstance;

    public static ImageLoaderManager getmInstance() {
        if (mInstance == null) {
            synchronized (ImageLoaderManager.class) {
                if (mInstance == null) {
                    mInstance = new ImageLoaderManager();
                }
            }
        }

        return mInstance;
    }

    public ImageLoaderManager() {

    }
}
