package uniandes.dpoo.taller4.consola;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;

public class PanelLienzo extends JComponent
{
	public void Paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(2f));
        g2d.setColor(Color.RED);
        g2d.fill(new Rectangle2D.Double(0, 0, 100, 100));
	}
}
