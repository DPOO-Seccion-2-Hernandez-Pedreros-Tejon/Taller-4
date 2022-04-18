package uniandes.dpoo.taller4.consola;
import uniandes.dpoo.taller4.modelo.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

import javax.swing.*;

public class Consola extends JFrame
{
	private Tablero tablero;

	
	
	public Consola( )
	{
	setTitle( "LightsOut" );
	setSize( 600, 700 );
	setResizable( false );
	setDefaultCloseOperation( EXIT_ON_CLOSE );
	setLayout( new GridLayout( 4, 3 ) );
	}
	public void paint(Graphics g)
	{
		Graphics2D g2s = (Graphics2D)g; 
		RoundRectangle2D.Double figura = new RoundRectangle2D.Double(300,300,200,200,5000000,100);
		g2s.draw(figura);
	}
	public static void main( String[] args )
	{
	try
	{
	Consola vent = new Consola( );
	vent.setVisible( true );
	}
	catch( Exception e )
	{
	JOptionPane.showMessageDialog( null, e.getMessage(), "Calculador impuestos", JOptionPane.ERROR_MESSAGE);
	}
	}

}
