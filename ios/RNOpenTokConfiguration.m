#import "RNOpenTokConfiguration.h"
#import "RNPublisherFactory.h"
#import "RNDefaultPublisherFactory.h"

@implementation RNOpenTokConfiguration{
    id<RNPublisherFactory>  _publisherFactory;
}

- (instancetype)initWithPublisherFactory:(id <RNPublisherFactory>)publisherFactory {
    self = [super init];
    if (self) {
        _publisherFactory = publisherFactory;
    }

    return self;
}

- (id <RNPublisherFactory>)fetchPublisherFactory {
    return _publisherFactory;
}

- (instancetype)init {
    return [[RNOpenTokConfiguration alloc] initWithPublisherFactory:[[RNDefaultPublisherFactory alloc] init]];
}

@end
