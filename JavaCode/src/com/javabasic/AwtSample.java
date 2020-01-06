package com.javabasic;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtSample extends Frame {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sanSerifLarge = new Font("SansSerif", Font.BOLD , 18);
        Font sanSerifSmall = new Font("SansSerif", Font.BOLD , 12);
        g.setFont(sanSerifLarge);
        g.drawString("The complete Java Developer Course", 60,  60);


    }

    public AwtSample(String title) throws HeadlessException {
        super(title);

        setSize(500, 400);
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
            }
        });


    }


}
