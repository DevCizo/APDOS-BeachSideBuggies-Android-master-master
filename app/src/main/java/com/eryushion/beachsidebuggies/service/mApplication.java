package com.eryushion.beachsidebuggies.service;

import android.content.Context;
import android.os.Environment;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;





/**
 * Created by kipl145 on 10/14/2015.
 */
public class mApplication extends MultiDexApplication {


    @Override
    public void onCreate() {
        super.onCreate();


    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

}
