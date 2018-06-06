package com.rnopentok;

import android.view.View;

import com.facebook.react.uimanager.util.ReactFindViewUtil;
import com.opentok.android.BaseVideoCapturer;

public class RNDefaultCapturerFactory implements RNCapturerFactory {
    @Override
    public BaseVideoCapturer fetchCapturer(RNOpentokPublisherConfiguration configuration) throws RNPublisherUncreatable {
        if (configuration.isScreenCapture()) {
            View captureView = ReactFindViewUtil.findView(configuration.getRootView(), "RN_OPENTOK_SCREEN_CAPTURE_VIEW");
            if (captureView == null) {
                throw new RNPublisherUncreatable();
            }
            return  new RNOpenTokScreenSharingCapturer(captureView, configuration.getCaptureSettings());
        } else {
            return null; //Defaults to video capturer if null
        }
    }
}
