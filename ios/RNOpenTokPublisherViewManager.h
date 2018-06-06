#if __has_include(<React/RCTViewManager.h>)
#import <React/RCTViewManager.h>

@class RNOpenTokConfiguration;
#elif __has_include("RCTViewManager.h")
#import "RCTViewManager.h"
#else
#import "React/RCTViewManager.h"
#endif

@interface RNOpenTokPublisherViewManager : RCTViewManager

-(instancetype) initWithConfiguration: (nonnull RNOpenTokConfiguration *) configuration;

@end
