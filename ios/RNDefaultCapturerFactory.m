#import "RNDefaultCapturerFactory.h"
#import "RNOpentokPublisherConfiguration.h"
#import "RNOpenTokScreenSharingCapturer.h"
#import "RCTUtils.h"
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

@protocol OTVideoCapture;

@implementation RNDefaultCapturerFactory {

}
- (id<OTVideoCapture>) fetchCapturer:(nonnull RNOpentokPublisherConfiguration *)configuration {
    if(configuration.screenCapture){
        UIView* rootView = RCTPresentedViewController().view;
        UIView* screenCaptureView = [configuration.uiManager viewForNativeID:@"RN_OPENTOK_SCREEN_CAPTURE_VIEW"
                                                                 withRootTag:configuration.reactTag];
        if (screenCaptureView) {
            RNOpenTokScreenSharingCapturer* capture = [[RNOpenTokScreenSharingCapturer alloc]
                    initWithView:screenCaptureView
                    withSettings: configuration.screenCaptureSettings];
            return capture;
        } else {
            [[NSNotificationCenter defaultCenter]
                    postNotificationName:@"errorNoScreenCaptureView"
                                  object:nil];
        }
    }
    return nil;//Defaults to video capturer if null
}

@end