package com.rnopentok;

import com.opentok.android.Publisher;
import com.opentok.android.PublisherKit;


public class RNDefaultPublisherFactory implements RNPublisherFactory {

    private final RNCapturerFactory rnCapturerFactory;

    public RNDefaultPublisherFactory(RNCapturerFactory rnCapturerFactory) {
        this.rnCapturerFactory = rnCapturerFactory;
    }

    @Override
    public Publisher fetchPublisher(RNOpentokPublisherConfiguration configuration) throws RNPublisherUncreatable {
        Publisher.Builder builder = new Publisher.Builder(configuration.getContext());
        builder.renderer(configuration.getVideoRenderer());
        builder.audioTrack(configuration.isAudioEnabled());
        builder.videoTrack(configuration.isVideoEnabled());
        builder.capturer(rnCapturerFactory.fetchCapturer(configuration));

        Publisher mPublisher = builder.build();

        if(configuration.isScreenCapture()){
            mPublisher.setPublisherVideoType(PublisherKit.PublisherKitVideoType.PublisherKitVideoTypeScreen);
            mPublisher.setAudioFallbackEnabled(false);
        }

        mPublisher.setPublisherListener(configuration.getPublisherListener());

        return mPublisher;
    }
}
