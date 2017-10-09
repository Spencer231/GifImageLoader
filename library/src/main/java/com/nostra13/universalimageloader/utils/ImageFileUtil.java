package com.nostra13.universalimageloader.utils;

import android.graphics.BitmapFactory;
import android.text.TextUtils;

/**
 * Created by panyi on 2017/4/6.
 */

public class ImageFileUtil {
    /**
     * 根据文件内容 判断是否是gif图片
     * @param path
     * @return
     */
    public static boolean isGifImageByFile(final String path) {
        if (TextUtils.isEmpty(path))
            return false;

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        final String mime = options.outMimeType;
        return TextUtils.isEmpty(mime) ? false : mime.toLowerCase().endsWith("gif");
    }

}//end class
