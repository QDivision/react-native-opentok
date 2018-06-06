package com.rnopentok;

import android.content.Context;
import android.view.View;

import com.facebook.react.bridge.ReadableMap;
import com.opentok.android.BaseVideoRenderer;
import com.opentok.android.PublisherKit;

public class RNOpentokPublisherConfiguration {
    private boolean screenCapture;
    private Context context;
    private BaseVideoRenderer videoRenderer;
    private boolean audioEnabled;
    private boolean videoEnabled;
    private ReadableMap captureSettings;
    private PublisherKit.PublisherListener publisherListener;
    private View rootView;

    public RNOpentokPublisherConfiguration(boolean screenCapture,
                                           Context context,
                                           BaseVideoRenderer videoRenderer,
                                           boolean audioEnabled,
                                           boolean videoEnabled,
                                           ReadableMap captureSettings,
                                           View rootView,
                                           PublisherKit.PublisherListener publisherListener) {
        this.screenCapture = screenCapture;
        this.context = context;
        this.videoRenderer = videoRenderer;
        this.audioEnabled = audioEnabled;
        this.videoEnabled = videoEnabled;
        this.captureSettings = captureSettings;
        this.rootView = rootView;
        this.publisherListener = publisherListener;
    }

    public boolean isScreenCapture() {
        return screenCapture;
    }

    public PublisherKit.PublisherListener getPublisherListener() {
        return publisherListener;
    }

    public Context getContext() {
        return context;
    }

    public BaseVideoRenderer getVideoRenderer() {
        return videoRenderer;
    }

    public boolean isAudioEnabled() {
        return audioEnabled;
    }

    public boolean isVideoEnabled() {
        return videoEnabled;
    }

    public ReadableMap getCaptureSettings() {
        return captureSettings;
    }

    public View getRootView() {
        return rootView;
    }
}
