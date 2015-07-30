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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/XplodePromotionDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements XplodePromotionDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("promotionWillOpenForBreakpoint:")
    public void promotionWillOpenForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionDidOpenForBreakpoint:")
    public void promotionDidOpenForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionWillCloseForBreakpoint:")
    public void promotionWillCloseForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionDidCloseForBreakpoint:")
    public void promotionDidCloseForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionWillLoadForBreakpoint:")
    public void promotionWillLoadForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionDidLoadForBreakpoint:isReadyToPresent:")
    public void promotionDidLoadForBreakpoint(String breakpoint, boolean isReadyToPresent) {}
    @NotImplemented("promotionDidFailLoadingForBreakpoint:")
    public void promotionDidFailLoadingForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionWillShowDockForBreakpoint:")
    public void promotionWillShowDockForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionDidShowDockForBreakpoint:")
    public void promotionDidShowDockForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionWillHideDockForBreakpoint:")
    public void promotionWillHideDockForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionDidHideDockForBreakpoint:")
    public void promotionDidHideDockForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionDidStartPlaybackForBreakpoint:")
    public void promotionDidStartPlaybackForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionDidAbortPlaybackForBreakpoint:")
    public void promotionDidAbortPlaybackForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionDidFinishPlaybackForBreakpoint:")
    public void promotionDidFinishPlaybackForBreakpoint(String breakpoint) {}
    @NotImplemented("promotionDidClickForBreakpoint:")
    public void promotionDidClickForBreakpoint(String breakpoint) {}
    /*</methods>*/
}
