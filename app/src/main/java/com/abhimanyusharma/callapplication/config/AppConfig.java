package com.abhimanyusharma.callapplication.config;

import android.app.Application;

import com.abhimanyusharma.callapplication.TableModel.CallData;
import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;

public class AppConfig extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
