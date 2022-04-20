package uniandes.dpoo.taller4.consola;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class PanelLienzo extends JPanel
{
    PanelLienzo() {
        //setBackground(Color.white);
        }
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        //Rectangle2D.Double rectangulo = new Rectangle2D.Double(0, 0, 100, 100);
        //g2d.draw(rectangulo);
        g2d.fillRect(0, 0, 100, 100);
    }
}
