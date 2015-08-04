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
package org.robovm.pods.pluso;

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
import org.robovm.apple.messageui.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PLSDKActionBar/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PLSDKActionBarPtr extends Ptr<PLSDKActionBar, PLSDKActionBarPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PLSDKActionBar.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PLSDKActionBar() {}
    protected PLSDKActionBar(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native PLSDKActionBarDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PLSDKActionBarDelegate v);
    @Property(selector = "barColor")
    public native UIColor getBarColor();
    @Property(selector = "setBarColor:")
    public native void setBarColor(UIColor v);
    @Property(selector = "buttonsColor")
    public native UIColor getButtonsColor();
    @Property(selector = "setButtonsColor:")
    public native void setButtonsColor(UIColor v);
    @Property(selector = "type")
    public native PLSDKActivityType getType();
    @Property(selector = "setType:")
    public native void setType(PLSDKActivityType v);
    @Property(selector = "shareURLString")
    public native String getShareURLString();
    @Property(selector = "setShareURLString:")
    public native void setShareURLString(String v);
    @Property(selector = "actionType")
    public native String getActionType();
    @Property(selector = "setActionType:")
    public native void setActionType(String v);
    @Property(selector = "feedbackEmail")
    public native String getFeedbackEmail();
    @Property(selector = "setFeedbackEmail:")
    public native void setFeedbackEmail(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
