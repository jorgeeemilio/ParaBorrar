package es.studium.Tema5;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejemplo2 implements WindowListener
{
	// Componentes
	Frame ventana = new Frame("Ventana");
	
	// Constructor
	Ejemplo2()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(300,150);
		ventana.addWindowListener(this);
		ventana.setVisible(true);
	}
	
	// Principal
	public static void main(String[] args)
	{
		new Ejemplo2();
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println("Se abrió");
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println("Se cerró");
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println("Minimizado");
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println("Maximizado");
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println("Primer plano");
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println("Segundo plano");
	}
}