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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPAdConversionTracker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSURLConnectionDataDelegate/*</implements>*/ {

    /*<ptr>*/public static class MPAdConversionTrackerPtr extends Ptr<MPAdConversionTracker, MPAdConversionTrackerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPAdConversionTracker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPAdConversionTracker() {}
    protected MPAdConversionTracker(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reportApplicationOpenForApplicationID:")
    public native void reportApplicationOpen(String appID);
    @Method(selector = "sharedConversionTracker")
    public static native MPAdConversionTracker sharedConversionTracker();
    @Method(selector = "connection:willSendRequest:redirectResponse:")
    public native NSURLRequest willSendRequest(NSURLConnection connection, NSURLRequest request, NSURLResponse response);
    @Method(selector = "connection:didReceiveResponse:")
    public native void didReceiveResponse(NSURLConnection connection, NSURLResponse response);
    @Method(selector = "connection:didReceiveData:")
    public native void didReceiveData(NSURLConnection connection, NSData data);
    @Method(selector = "connection:needNewBodyStream:")
    public native NSInputStream needNewBodyStream(NSURLConnection connection, NSURLRequest request);
    @Method(selector = "connection:didSendBodyData:totalBytesWritten:totalBytesExpectedToWrite:")
    public native void didSendBodyData(NSURLConnection connection, @MachineSizedSInt long bytesWritten, @MachineSizedSInt long totalBytesWritten, @MachineSizedSInt long totalBytesExpectedToWrite);
    @Method(selector = "connection:willCacheResponse:")
    public native NSCachedURLResponse willCacheResponse(NSURLConnection connection, NSCachedURLResponse cachedResponse);
    @Method(selector = "connectionDidFinishLoading:")
    public native void didFinishLoading(NSURLConnection connection);
    @Method(selector = "connection:didFailWithError:")
    public native void didFail(NSURLConnection connection, NSError error);
    @Method(selector = "connectionShouldUseCredentialStorage:")
    public native boolean shouldUseCredentialStorage(NSURLConnection connection);
    @Method(selector = "connection:willSendRequestForAuthenticationChallenge:")
    public native void willSendRequestForAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "connection:canAuthenticateAgainstProtectionSpace:")
    public native boolean canAuthenticateAgainstProtectionSpace(NSURLConnection connection, NSURLProtectionSpace protectionSpace);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "connection:didReceiveAuthenticationChallenge:")
    public native void didReceiveAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "connection:didCancelAuthenticationChallenge:")
    public native void didCancelAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge);
    /*</methods>*/
}
