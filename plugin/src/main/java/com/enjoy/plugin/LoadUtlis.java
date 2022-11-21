package com.enjoy.plugin;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

import java.lang.reflect.Method;

public class LoadUtlis {

    private final static String apkPath = "/sdcard/plugin-debug.apk";

    private static Resources mResouces;

    public static Resources getResource(Context context) {
        if (mResouces == null) {
            mResouces = loadResource(context);
        }
        return mResouces;
    }

    private static Resources loadResource(Context context) {
        try {
            AssetManager assetManager = AssetManager.class.newInstance();

            Method addAssetPathMethod = assetManager.getClass().getDeclaredMethod("addAssetPath", String.class);
            addAssetPathMethod.setAccessible(true);
            // 参数就是插件的资源路径
            addAssetPathMethod.invoke(assetManager, apkPath);

            Resources resources = context.getResources();

            return new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
