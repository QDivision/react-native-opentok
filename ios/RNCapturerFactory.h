#import <Foundation/Foundation.h>

@class RNOpentokPublisherConfiguration;
@protocol OTVideoCapture;

@protocol RNCapturerFactory <NSObject>
-(id<OTVideoCapture>) fetchCapturer:(nonnull RNOpentokPublisherConfiguration *) configuration;
@end