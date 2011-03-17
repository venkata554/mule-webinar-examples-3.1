/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.baseball;


public class Averages
{
    public String lookup(String name)
    {
        if (name.equals("Mays"))
        {
            return ".302";
        }
        if (name.equals("Aaron"))
        {
            return ".305";
        }
        if (name.equals("Ruth"))
        {
            return ".342";
        }
        return "Unknown";
    }
}
