package es.studium.Tema5;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejemplo1 implements ActionListener, WindowListener
{
	Frame ventana = new Frame("Eventos");
	Button btnAceptar = new Button("Aceptar");
	Button btnCancelar = new Button("Cancelar");
	
	public Ejemplo1()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(200,100);
		btnAceptar.addActionListener(this);
		btnCancelar.addActionListener(this);
		ventana.addWindowListener(this);
		ventana.add(btnAceptar);
		ventana.add(btnCancelar);
		ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(btnAceptar))
		{
			System.out.println("Pulsaste el botón Aceptar");
		}
		else
		{
			System.out.println("Pulsaste el botón Cancelar");
		}
	}
	public static void main(String[] args)
	{
		new Ejemplo1();
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
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
		
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}