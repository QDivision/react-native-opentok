#import <OpenTok/OpenTok/OpenTok.h>
#import "RNOpentokPublisherConfiguration.h"
#import "RCTUIManager.h"

@implementation RNOpentokPublisherConfiguration {
    id <OTPublisherDelegate> publisherDelegate;
    OTPublisherSettings *publisherSettings;
    BOOL isScreenCapture;
    RCTUIManager *uiManager;
    NSNumber *reactTag;
    NSDictionary *screenCaptureSettings;
}

- (id <OTPublisherDelegate>)publisherDelegate {
    return publisherDelegate;
}

- (OTPublisherSettings *)publisherSettings {
    return publisherSettings;
}

- (BOOL)screenCapture {
    return isScreenCapture;
}

- (RCTUIManager *)uiManager {
    return uiManager;
}

- (NSNumber *)reactTag {
    return reactTag;
}

- (NSDictionary *)screenCaptureSettings {
    return screenCaptureSettings;
}

- (instancetype)initWithPublisherDelegate:(id <OTPublisherDelegate>)aPublisherDelegate
                        publisherSettings:(OTPublisherSettings *)aPublisherSettings
                          isScreenCapture:(BOOL)anIsScreenCapture
                                uiManager:(RCTUIManager *)anUiManager
                                 reactTag:(NSNumber *)aReactTag
                    screenCaptureSettings:(NSDictionary *)aScreenCaptureSettings {
    self = [super init];
    if (self) {
        publisherDelegate = aPublisherDelegate;
        publisherSettings = aPublisherSettings;
        isScreenCapture = anIsScreenCapture;
        uiManager = anUiManager;
        reactTag = aReactTag;
        screenCaptureSettings = aScreenCaptureSettings;
    }

    return self;
}


@end