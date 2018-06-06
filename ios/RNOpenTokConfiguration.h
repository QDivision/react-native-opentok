#import <Foundation/Foundation.h>

@protocol RNPublisherFactory;

@interface RNOpenTokConfiguration : NSObject
- (instancetype)initWithPublisherFactory:(id <RNPublisherFactory>)publisherFactory;

- (id<RNPublisherFactory>) fetchPublisherFactory;

@end
