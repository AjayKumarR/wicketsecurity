package com.mycompany;


import org.apache.wicket.markup.html.basic.Label;

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
            setResponsePage(LoginPage.class);
        }
        add(new Label("label1", "Click on a link above for RBAC administration."));
    }
}