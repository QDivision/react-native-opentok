#import <Foundation/Foundation.h>
#import "RNPublisherFactory.h"

@protocol RNCapturerFactory;

@interface RNDefaultPublisherFactory : NSObject <RNPublisherFactory>
- (instancetype)initWithCapturerFactory:(id <RNCapturerFactory>)aCapturerFactory;

+ (instancetype)factoryWithCapturerFactory:(id <RNCapturerFactory>)aCapturerFactory;

@end