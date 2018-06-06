package com.rnopentok;

import java.util.Arrays;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

public class RNOpenTokPackage implements ReactPackage {

    private RNOpentokConfiguration rnOpentokConfiguration;

    public RNOpenTokPackage(RNOpentokConfiguration rnOpentokConfiguration) {
        this.rnOpentokConfiguration = rnOpentokConfiguration;
    }

    public RNOpenTokPackage(){
        this(new RNOpentokConfiguration.Builder()
                .build());
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.<NativeModule>asList(
                new RNOpenTokModule(reactContext)
        );
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Arrays.<ViewManager>asList(
                new RNOpenTokSubscriberViewManager(),
                new RNOpenTokPublisherViewManager(rnOpentokConfiguration.getRnPublisherFactory())
        );
    }
}
