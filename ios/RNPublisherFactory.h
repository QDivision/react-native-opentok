#import <Foundation/Foundation.h>

@class OTPublisher;
@class RNOpentokPublisherConfiguration;

@protocol RNPublisherFactory <NSObject>
  -(OTPublisher *) fetchPublisher: (RNOpentokPublisherConfiguration *)configuration;
@end