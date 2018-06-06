#import "RNDefaultPublisherFactory.h"
#import "RCTUtils.h"
#import "RNOpenTokScreenSharingCapturer.h"
#import "RNOpentokPublisherConfiguration.h"
#import "RCTUIManager.h"
#import "RNCapturerFactory.h"
#import "RNDefaultCapturerFactory.h"

#if __has_include(<React/UIView+React.h>)
#import "React/UIView+React.h"
#elif __has_include("UIView+React.h")
#import <React/UIView+React.h>
#else
#import "React/UIView+React.h"
#endif

@implementation RNDefaultPublisherFactory{
    id<RNCapturerFactory> capturerFactory;
}

- (instancetype)initWithCapturerFactory:(id <RNCapturerFactory>)aCapturerFactory {
    self = [super init];
    if (self) {
        capturerFactory = aCapturerFactory;
    }

    return self;
}

- (instancetype)init {
    return [self initWithCapturerFactory:[[RNDefaultCapturerFactory alloc] init]];
}

+ (instancetype)factoryWithCapturerFactory:(id <RNCapturerFactory>)aCapturerFactory {
    return [[self alloc] initWithCapturerFactory:aCapturerFactory];
}

- (OTPublisher *)fetchPublisher:(RNOpentokPublisherConfiguration *)configuration {
    OTPublisher * newPublisher = [[OTPublisher alloc] initWithDelegate:configuration.publisherDelegate settings: configuration.publisherSettings];

    id <OTVideoCapture> capturer = [capturerFactory fetchCapturer:configuration];
    if(capturer != nil){
        [newPublisher setVideoCapture:capturer];
    }

    if (configuration.screenCapture) {
        [newPublisher setVideoType:OTPublisherKitVideoTypeScreen];
        [newPublisher setAudioFallbackEnabled:NO];
    } else {
        newPublisher.cameraPosition = AVCaptureDevicePositionFront;
    }

    return newPublisher;
}

@end