package com.mycompany;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;


public class Page1 extends MyBasePage
{
    public Page1()
    {
        add(new Label("label1", "This is in Page1"));
    }
}
