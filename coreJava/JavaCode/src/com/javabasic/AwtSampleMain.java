package com.javabasic;

import java.awt.*;

public class AwtSampleMain {
    public static void main(String[] args) {

        AwtSample awtSample = new AwtSample("Chicago");
        Graphics g1 =null;
        awtSample.paint(g1);
    }
}
