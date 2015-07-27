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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPAdViewPtr extends Ptr<MPAdView, MPAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPAdView() {}
    protected MPAdView(SkipInit skipInit) { super(skipInit); }
    public MPAdView(String adUnitId, @ByVal CGSize size) { super((SkipInit) null); initObject(init(adUnitId, size)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MPAdViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPAdViewDelegate v);
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
    @Property(selector = "ignoresAutorefresh")
    public native boolean ignoresAutorefresh();
    @Property(selector = "setIgnoresAutorefresh:")
    public native void setIgnoresAutorefresh(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitId:size:")
    protected native @Pointer long init(String adUnitId, @ByVal CGSize size);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "refreshAd")
    public native void refreshAd();
    @Method(selector = "forceRefreshAd")
    public native void forceRefreshAd();
    @Method(selector = "rotateToOrientation:")
    public native void rotateToOrientation(UIInterfaceOrientation newOrientation);
    @Method(selector = "lockNativeAdsToOrientation:")
    public native void lockNativeAdsToOrientation(MPNativeAdOrientation orientation);
    @Method(selector = "unlockNativeAdsOrientation")
    public native void unlockNativeAdsOrientation();
    @Method(selector = "allowedNativeAdsOrientation")
    public native MPNativeAdOrientation allowedNativeAdsOrientation();
    @Method(selector = "adContentViewSize")
    public native @ByVal CGSize adContentViewSize();
    @Method(selector = "stopAutomaticallyRefreshingContents")
    public native void stopAutomaticallyRefreshingContents();
    @Method(selector = "startAutomaticallyRefreshingContents")
    public native void startAutomaticallyRefreshingContents();
    @Method(selector = "customEventDidLoadAd")
    public native void customEventDidLoadAd();
    @Method(selector = "customEventDidFailToLoadAd")
    public native void customEventDidFailToLoadAd();
    @Method(selector = "customEventActionWillBegin")
    public native void customEventActionWillBegin();
    @Method(selector = "customEventActionDidEnd")
    public native void customEventActionDidEnd();
    /*</methods>*/
}
