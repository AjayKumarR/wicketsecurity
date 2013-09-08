/*
 * Copyright (c) 2013, JoshuaTree Software. All rights reserved.
 */
package com.mycompany;


import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.http.handler.RedirectRequestHandler;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @author Shawn McKinney
 * @version $Rev$
 */
public class LaunchPage extends MyBasePage
{
    public LaunchPage()
    {
        HttpServletRequest servletReq = (HttpServletRequest)getRequest().getContainerRequest();
        Principal principal = servletReq.getUserPrincipal();
        if(principal == null)
        {
            getRequestCycle().scheduleRequestHandlerAfterCurrent(new RedirectRequestHandler("/login/login.html"));
        }
        add(new Label("label1", "You have access to the link(s) above."));
    }
}