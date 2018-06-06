package com.rnopentok;

import com.opentok.android.Publisher;

public interface RNPublisherFactory {

    Publisher fetchPublisher(RNOpentokPublisherConfiguration configuration) throws RNPublisherUncreatable;

}
