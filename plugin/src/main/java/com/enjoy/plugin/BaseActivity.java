package com.enjoy.plugin;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Field;

public class BaseActivity extends AppCompatActivity {

    protected Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Resources resource = LoadUtlis.getResource(getApplication());

        // 替换这个 context 的resource 为我们自己写的 resource
        mContext = new ContextThemeWrapper(getBaseContext(), 0);

        Class<? extends Context> clazz = mContext.getClass();
        try {
            Field mResourcesField = clazz.getDeclaredField("mResources");
            mResourcesField.setAccessible(true);
            mResourcesField.set(mContext, resource);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //    @Override
//    public Resources getResources() {
//
//        if (getApplication() != null && getApplication().getResources() != null) {
//            //这个实际返回的是我们自己创建的 resources
//            return getApplication().getResources();
//        }
//
//        return super.getResources();
//    }
}
