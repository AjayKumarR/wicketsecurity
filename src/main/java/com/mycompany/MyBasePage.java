/*
 * This is free and unencumbered software released into the public domain.
 */
package com.mycompany;

import org.apache.log4j.Logger;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;

import javax.servlet.http.HttpServletRequest;

/**
 * Base class for MyProject.
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public abstract class MyBasePage extends WebPage
{
    private static final Logger LOG = Logger.getLogger( MyBasePage.class.getName() );

    public MyBasePage()
    {
        SecureBookmarkablePageLink page1Link = new SecureBookmarkablePageLink( "page1", Page1.class, "ROLE_TEST1" );
        add( page1Link );
        SecureBookmarkablePageLink page2Link = new SecureBookmarkablePageLink( "page2", Page2.class, "ROLE_TEST1,ROLE_TEST2" );
        add( page2Link );
        SecureBookmarkablePageLink page3Link = new SecureBookmarkablePageLink( "page3", Page3.class, "ROLE_TEST1,ROLE_TEST3" );
        add( page3Link );
        final Link actionLink = new Link( "logout" )
        {
            @Override
            public void onClick()
            {
                HttpServletRequest servletReq = ( HttpServletRequest ) getRequest().getContainerRequest();
                servletReq.getSession().invalidate();
                getSession().invalidate();
                setResponsePage( LaunchPage.class );
            }
        };
        add( actionLink );
        add( new Label( "footer", "This is free and unencumbered software released into the public domain." ) );
    }
}