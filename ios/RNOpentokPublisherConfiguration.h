#import <Foundation/Foundation.h>
#import <OpenTok/OpenTok.h>

@class RCTUIManager;
@protocol OTPublisherDelegate;

@interface RNOpentokPublisherConfiguration : NSObject
- (instancetype)initWithPublisherDelegate:(id <OTPublisherDelegate>)aPublisherDelegate publisherSettings:(OTPublisherSettings *)aPublisherSettings isScreenCapture:(BOOL)anIsScreenCapture uiManager:(RCTUIManager *)anUiManager reactTag:(NSNumber *)aReactTag screenCaptureSettings:(NSDictionary *)aScreenCaptureSettings;

- (id <OTPublisherDelegate>)publisherDelegate;

- (OTPublisherSettings *)publisherSettings;

- (BOOL)screenCapture;

- (id)uiManager;

- (NSNumber *)reactTag;

- (NSDictionary *)screenCaptureSettings;

@end