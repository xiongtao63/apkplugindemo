package com.enjoy.leo_plugin;

import android.app.Application;
import android.content.res.Resources;

public class MyApplication extends Application {

//    private Resources resources;

    @Override
    public void onCreate() {
        super.onCreate();

        LoadUtil.loadClass(this);
//        resources = LoadUtil.loadResource(this);

        HookUtil.hookAMS();
        HookUtil.hookHandler();

    }

//    @Override
//    public Resources getResources() {
//        return resources == null ? super.getResources() : resources;
//    }
}
