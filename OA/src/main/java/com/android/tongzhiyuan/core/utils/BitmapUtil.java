package com.android.tongzhiyuan.core.utils;

import android.media.ExifInterface;

import java.io.IOException;

/**
 * Created by Administrator on 2017/3/2 0002.
 */

public class BitmapUtil {
    /**
     * 读取图片属性：图片被旋转的角度
     *
     * @param path
     *            图片绝对路径
     * @return 旋转的角度
     */
    public static int readPictureDegree(String path) {
        int degree = 0;
        try {
            ExifInterface exifInterface = new ExifInterface(path);
            int orientation = exifInterface.getAttributeInt(
                    ExifInterface.TAG_ORIENTATION,
                    ExifInterface.ORIENTATION_NORMAL);
            switch (orientation) {
                case ExifInterface.ORIENTATION_ROTATE_90:
                    degree = 90;
                    break;
                case ExifInterface.ORIENTATION_ROTATE_180:
                    degree = 180;
                    break;
                case ExifInterface.ORIENTATION_ROTATE_270:
                    degree = 270;
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return degree;
    }
}
