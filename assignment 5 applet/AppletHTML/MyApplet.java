// WAP TO PERFORM HTML APPLET TAG

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello from Applet!", 50, 100);
    }
}
