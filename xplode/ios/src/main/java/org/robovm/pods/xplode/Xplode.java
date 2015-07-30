/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.xplode;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Xplode/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class XplodePtr extends Ptr<Xplode, XplodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Xplode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Xplode() {}
    protected Xplode(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "logEvent:")
    public static native void logEvent(NSObject eventName);
    @Method(selector = "logEvent:withParameters:")
    public static native void logEvent(NSObject eventName, NSObject parameters);
    @Method(selector = "promotionDelegate")
    public static native XplodePromotionDelegate promotionDelegate();
    @Method(selector = "setPromotionDelegate:")
    public static native void setPromotionDelegate(XplodePromotionDelegate delegate);
    @Method(selector = "isCurrentDeviceSupported")
    public static native boolean isCurrentDeviceSupported();
    @Method(selector = "setPromotionPreloadingOnLaunch:")
    public static native void setPromotionPreloadingOnLaunch(boolean enablePreloading);
    @Method(selector = "cachePromotionForBreakpoint:")
    public static native void cachePromotionForBreakpoint(String breakpoint);
    @Method(selector = "presentPromotionForBreakpoint:withCompletionHandler:andDismissHandler:")
    public static native void presentPromotion(String breakpoint, @Block VoidBlock2<Boolean, NSError> completionHandler, @Block VoidBlock1<Void> dismissHandler);
    @Method(selector = "isPromotionCachedForBreakpoint:")
    public static native boolean isPromotionCachedForBreakpoint(String breakpoint);
    @Method(selector = "isPromotionOpen")
    public static native boolean isPromotionOpen();
    @Method(selector = "isPromotionDockVisible")
    public static native boolean isPromotionDockVisible();
    @Method(selector = "setupPromotionDockForBreakpoint:atPosition:withCompletionHandler:")
    public static native void setupPromotionDock(String breakpoint, XPLPromotionDockingPosition position, @Block VoidBlock2<Boolean, NSError> completionHandler);
    @Method(selector = "setupPromotionDockForBreakpoint:atPosition:withDimensions:")
    public static native void setupPromotionDock(String breakpoint, XPLPromotionDockingPosition position, XPLPromotionDockDimensions dimensions);
    @Method(selector = "setupPromotionDockForBreakpoint:atPosition:withDimensions:andCompletionHandler:")
    public static native void setupPromotionDock(String breakpoint, XPLPromotionDockingPosition position, XPLPromotionDockDimensions dimensions, @Block VoidBlock2<Boolean, NSError> completionHandler);
    @Method(selector = "showPromotionDockAndBounce:")
    public static native void showPromotionDockAndBounce(boolean bounce);
    @Method(selector = "hidePromotionDock")
    public static native void hidePromotionDock();
    @Method(selector = "removePromotionDock")
    public static native void removePromotionDock();
    @Method(selector = "dismissPromotion")
    public static native void dismissPromotion();
    @Method(selector = "allowedOrientations")
    public static native NSObject allowedOrientations();
    @Method(selector = "setAllowedOrientations:")
    public static native void setAllowedOrientations(NSObject allowedOrientations);
    @Method(selector = "registerDeviceTokenWithData:withCompletionHandler:")
    public static native void registerDeviceToken(NSData deviceToken, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "registerDeviceTokenWithString:withCompletionHandler:")
    public static native void registerDeviceToken(String deviceToken, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "handlePushNotificationPayload:withFetchCompletionHandler:")
    public static native void handlePushNotificationPayload(NSDictionary<?, ?> userInfo, @Block VoidBlock1<Integer> completionHandler);
    @Method(selector = "affiliateLinkForBreakpoint:withCompletionHandler:")
    public static native void affiliateLinkForBreakpoint(String breakpoint, @Block VoidBlock1<NSURL> completionHandler);
    @Method(selector = "loadAvailableRewards:")
    public static native void loadAvailableRewards(@Block VoidBlock1<NSArray> completionHandler);
    @Method(selector = "initializeWithOrganizationSecret:launchOptions:andCompletionHandler:")
    public static native void init(String organizationSecret, NSDictionary<?, ?> launchOptions, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "isInitialized")
    public static native boolean isInitialized();
    @Method(selector = "initializationError")
    public static native NSError initializationError();
    /*</methods>*/
}
