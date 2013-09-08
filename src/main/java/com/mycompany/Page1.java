/*
 * This is free and unencumbered software released into the public domain.
 */
package com.mycompany;


import org.apache.wicket.markup.html.basic.Label;


public class Page1 extends MyBasePage
{
    public Page1()
    {
        add(new Label("label1", "This is in Page1"));
    }
}
