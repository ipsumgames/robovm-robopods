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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/XplodePromotionDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "promotionWillOpenForBreakpoint:")
    void promotionWillOpenForBreakpoint(String breakpoint);
    @Method(selector = "promotionDidOpenForBreakpoint:")
    void promotionDidOpenForBreakpoint(String breakpoint);
    @Method(selector = "promotionWillCloseForBreakpoint:")
    void promotionWillCloseForBreakpoint(String breakpoint);
    @Method(selector = "promotionDidCloseForBreakpoint:")
    void promotionDidCloseForBreakpoint(String breakpoint);
    @Method(selector = "promotionWillLoadForBreakpoint:")
    void promotionWillLoadForBreakpoint(String breakpoint);
    @Method(selector = "promotionDidLoadForBreakpoint:isReadyToPresent:")
    void promotionDidLoadForBreakpoint(String breakpoint, boolean isReadyToPresent);
    @Method(selector = "promotionDidFailLoadingForBreakpoint:")
    void promotionDidFailLoadingForBreakpoint(String breakpoint);
    @Method(selector = "promotionWillShowDockForBreakpoint:")
    void promotionWillShowDockForBreakpoint(String breakpoint);
    @Method(selector = "promotionDidShowDockForBreakpoint:")
    void promotionDidShowDockForBreakpoint(String breakpoint);
    @Method(selector = "promotionWillHideDockForBreakpoint:")
    void promotionWillHideDockForBreakpoint(String breakpoint);
    @Method(selector = "promotionDidHideDockForBreakpoint:")
    void promotionDidHideDockForBreakpoint(String breakpoint);
    @Method(selector = "promotionDidStartPlaybackForBreakpoint:")
    void promotionDidStartPlaybackForBreakpoint(String breakpoint);
    @Method(selector = "promotionDidAbortPlaybackForBreakpoint:")
    void promotionDidAbortPlaybackForBreakpoint(String breakpoint);
    @Method(selector = "promotionDidFinishPlaybackForBreakpoint:")
    void promotionDidFinishPlaybackForBreakpoint(String breakpoint);
    @Method(selector = "promotionDidClickForBreakpoint:")
    void promotionDidClickForBreakpoint(String breakpoint);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
