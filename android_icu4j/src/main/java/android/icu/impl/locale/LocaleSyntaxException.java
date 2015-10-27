/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 *******************************************************************************
 * Copyright (C) 2009, International Business Machines Corporation and         *
 * others. All Rights Reserved.                                                *
 *******************************************************************************
 */
package android.icu.impl.locale;

/** @hide All android.icu classes are currently hidden */
public class LocaleSyntaxException extends Exception {

    private static final long serialVersionUID = 1L;

    private int _index = -1;

    public LocaleSyntaxException(String msg) {
        this(msg, 0);
    }

    public LocaleSyntaxException(String msg, int errorIndex) {
        super(msg);
        _index = errorIndex;
    }

    public int getErrorIndex() {
        return _index;
    }
}