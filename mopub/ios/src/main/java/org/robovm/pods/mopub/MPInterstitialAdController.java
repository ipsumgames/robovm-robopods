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
package org.robovm.pods.mopub;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPInterstitialAdController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPInterstitialAdControllerPtr extends Ptr<MPInterstitialAdController, MPInterstitialAdControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPInterstitialAdController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPInterstitialAdController() {}
    protected MPInterstitialAdController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MPInterstitialAdControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPInterstitialAdControllerDelegate v);
    @Property(selector = "adUnitId")
    public native String getAdUnitId();
    @Property(selector = "setAdUnitId:")
    public native void setAdUnitId(String v);
    @Property(selector = "keywords")
    public native String getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(String v);
    @Property(selector = "location")
    public native CLLocation getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(CLLocation v);
    @Property(selector = "isTesting")
    public native boolean isTesting();
    @Property(selector = "setTesting:")
    public native void setTesting(boolean v);
    @Property(selector = "ready")
    public native boolean isReady();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "showFromViewController:")
    public native void showFromViewController(UIViewController controller);
    @Method(selector = "customEventDidLoadAd")
    public native void customEventDidLoadAd();
    @Method(selector = "customEventDidFailToLoadAd")
    public native void customEventDidFailToLoadAd();
    @Method(selector = "customEventActionWillBegin")
    public native void customEventActionWillBegin();
    @Method(selector = "interstitialAdControllerForAdUnitId:")
    public static native MPInterstitialAdController init(String adUnitId);
    @Method(selector = "removeSharedInterstitialAdController:")
    public static native void removeSharedInterstitialAdController(MPInterstitialAdController controller);
    @Method(selector = "sharedInterstitialAdControllers")
    public static native NSMutableArray<?> sharedInterstitialAdControllers();
    /*</methods>*/
}
