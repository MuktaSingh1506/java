import java.applet.Applet;
import java.awt.*;

public class CircleApplet extends Applet {
    Color circleColor;

    public void init() {
        String colorParam = getParameter("color");
        if (colorParam == null) {
            circleColor = Color.RED;
        } else {
            switch (colorParam.toLowerCase()) {
                case "blue": circleColor = Color.BLUE; break;
                case "green": circleColor = Color.GREEN; break;
                case "yellow": circleColor = Color.YELLOW; break;
                default: circleColor = Color.RED;
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(circleColor);
        g.fillOval(50, 50, 100, 100); 
    }
}
