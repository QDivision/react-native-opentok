package com.rnopentok;

import com.opentok.android.BaseVideoCapturer;

public interface RNCapturerFactory {
    BaseVideoCapturer fetchCapturer(RNOpentokPublisherConfiguration configuration) throws RNPublisherUncreatable;
}
