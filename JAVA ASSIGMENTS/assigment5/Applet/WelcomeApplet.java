import java.applet.Applet;
import java.awt.Graphics;

public class WelcomeApplet extends Applet {

    // The paint() method is called automatically by the browser or applet viewer
    public void paint(Graphics g) {
        g.drawString("Welcome to Java Applet", 50, 50);
    }
}
