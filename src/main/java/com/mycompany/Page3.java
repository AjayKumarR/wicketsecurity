package com.mycompany;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;


public class Page3 extends MyBasePage
{
    public Page3()
    {
        add(new Label("label3", "This is Page3"));
    }
}
