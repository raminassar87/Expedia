/*
 * Copyright (c) Expedia 2017.
 * All Rights Reserved.
 * * ver    Developer          Date        Comments
 * -----  -----------------  ----------  ----------------------------------------
 * 1.00    Rami Nassar       02/08/2017  - File created.
 */
package com.expedia.utils;

public class Utils {

    /**
     * Is Blank Or Null
     *
     * @param value : String Value
     * @return True if String Value Is Blank Or Null
     */
    public static boolean isBlankOrNull(String value) {
        return value == null || value.trim().length() == 0;
    }
}
