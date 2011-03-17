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

import org.mule.DefaultMuleMessage;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class Formatter implements Callable
{

    public Object onCall(MuleEventContext muleEventContext) throws Exception
    {
        MuleMessage msg = muleEventContext.getMessage();
        String name = msg.getPayloadAsString();
        String avg = msg.getOutboundProperty("average");
        String rbi = msg.getOutboundProperty("rbi");
        String hr = msg.getOutboundProperty("hr");
        String formatted = "<html><body><table>" + makeRow("Name", name) +
                           makeRow("Average", avg) + makeRow("RBIs", rbi) + makeRow("Home Runs",hr) +
                           "</table></body></html>";
        MuleMessage response = new DefaultMuleMessage(formatted, muleEventContext.getMuleContext());
        response.setOutboundProperty("content-type", "text/html");
        return response;
    }

    private String makeRow(String name, String value)
    {
        return "<tr><td>" + name + "</td><td>" + value + "</td></tr>";
    }
}
