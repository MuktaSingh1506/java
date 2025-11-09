import java.applet.Applet;
import java.awt.Graphics;

public class ParamApplet extends Applet {
    String name;
    int age;

    public void init() {
        name = getParameter("username");
        String ageParam = getParameter("userage");

        if (ageParam != null) {
            age = Integer.parseInt(ageParam);
        }
    }

    public void paint(Graphics g) {
        g.drawString("Name: " + name, 50, 50);
        g.drawString("Age: " + age, 50, 70);
    }
}
