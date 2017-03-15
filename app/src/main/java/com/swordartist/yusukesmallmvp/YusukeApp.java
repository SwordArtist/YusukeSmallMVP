package com.swordartist.yusukesmallmvp;

import android.app.Application;
import android.content.Context;

/**
 * Created by Yusuke Yanai on 2017-03-07.
 */

public class YusukeApp extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext() {
        return mContext;
    }

}
