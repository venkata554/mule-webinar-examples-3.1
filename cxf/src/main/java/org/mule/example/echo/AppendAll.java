/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.example.echo;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class AppendAll extends AbstractTransformer
{
    @Override
    protected Object doTransform(Object src, String enc) throws TransformerException
    {
        if (src == null)
        {
            return "";
        }
        else if (!src.getClass().isArray())
        {
            return src.toString();
        }
        else
        {
            StringBuilder builder = new StringBuilder();
            for (Object o : (Object[])src)
            {
                if (o != null)
                {
                    builder.append(o);
                }
            }
            return builder.toString();
        }
    }
}
