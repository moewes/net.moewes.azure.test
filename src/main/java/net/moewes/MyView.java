package net.moewes;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.html.H1;


@CloudUiView("/myview")
public class MyView extends Div {

    public MyView() {
        add( new H1("Hello CloudUi"));
    }
}