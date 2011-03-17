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

public class RBIs
{
    public String lookup(String name)
    {
        if (name.equals("Mays"))
        {
            return "1903";
        }
        if (name.equals("Aaron"))
        {
            return "2297";
        }
        if (name.equals("Ruth"))
        {
            return "2213";
        }
        return "Unknown";
    }
}

