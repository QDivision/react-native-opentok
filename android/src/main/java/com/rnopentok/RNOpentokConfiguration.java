package com.rnopentok;

public class RNOpentokConfiguration {

    private final RNPublisherFactory rnPublisherFactory;

    public RNOpentokConfiguration(RNPublisherFactory rnPublisherFactory) {
        this.rnPublisherFactory = rnPublisherFactory;
    }

    public RNPublisherFactory getRnPublisherFactory() {
        return rnPublisherFactory;
    }

    static class Builder {

       public RNOpentokConfiguration build(){
           return new RNOpentokConfiguration(new RNDefaultPublisherFactory(new RNDefaultCapturerFactory()));
       }
    }
}
