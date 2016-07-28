package com.magomtz.android.loginfacebookerror;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by Mago on 27/07/2016.
 */
public class FacebookApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initFacebook();
    }

    private void initFacebook() {
        FacebookSdk.sdkInitialize(this);
        AppEventsLogger.activateApp(this);
    }
}
