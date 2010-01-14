package com.meterware.httpunit;
/********************************************************************************************************************
* $Id: FormControl.java 786 2007-11-23 18:36:23Z wolfgang_fahl $
*
* Copyright (c) 2001-2007, Russell Gold
*
* Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
* documentation files (the "Software"), to deal in the Software without restriction, including without limitation
* the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
* to permit persons to whom the Software is furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in all copies or substantial portions
* of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
* THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
* CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
* DEALINGS IN THE SOFTWARE.
*
*******************************************************************************************************************/

import com.meterware.httpunit.dom.HTMLInputElementImpl;

public class RadioButtonFormControl extends BooleanFormControl {

    public String getType() {
        return RADIO_BUTTON_TYPE;
    }

    public RadioButtonFormControl( WebForm form, HTMLInputElementImpl element ) {
        super( form, element );
    }


    /**
     * Returns true if only one control of this kind can have a value.
     **/
    public boolean isExclusive() {
        return true;
    }


    public String getQueryValue() {
        return getValueAttribute();
    }
}

