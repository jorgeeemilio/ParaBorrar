package es.studium.Tema5;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio4 implements ActionListener, WindowListener
{
	Frame ventana = new Frame("Aficiones");
	Checkbox chkCorrer = new Checkbox("Correr");
	Checkbox chkNadar = new Checkbox("Nadar");
	Checkbox chkAndar = new Checkbox("Andar");
	Checkbox chkLeer = new Checkbox("Leer");
	Checkbox chkCine = new Checkbox("Ir al Cine");
	Checkbox chkBailar = new Checkbox("Bailar");
	Checkbox chkFutbol = new Checkbox("Fútbol");
	Checkbox chkTenis = new Checkbox("Tenis");
	Checkbox chkBaloncesto = new Checkbox("Baloncesto");
	Checkbox chkVela = new Checkbox("Deportes de Vela");
	Button btnComprobar = new Button("Comprobar"); 
	
	public Ejercicio4()
	{
		ventana.setLayout(new FlowLayout());
		ventana.addWindowListener(this);
		ventana.add(chkCorrer);
		ventana.add(chkNadar);
		ventana.add(chkAndar);
		ventana.add(chkLeer);
		ventana.add(chkCine);
		ventana.add(chkBailar);
		ventana.add(chkFutbol);
		ventana.add(chkTenis);
		ventana.add(chkBaloncesto);
		ventana.add(chkVela);
		btnComprobar.addActionListener(this);
		ventana.add(btnComprobar);
		ventana.setSize(350,150);
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio4();
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
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		String resultado = "Has elegido:\n";
		if(chkCorrer.getState())
		{
			resultado = resultado + "Correr\n";
		}
		if(chkNadar.getState())
		{
			resultado = resultado + "Nadar\n";
		}
		if(chkAndar.getState())
		{
			resultado = resultado + "Andar\n";
		}
		if(chkLeer.getState())
		{
			resultado = resultado + "Leer\n";
		}
		if(chkCine.getState())
		{
			resultado = resultado + "Ir al cine\n";
		}
		if(chkBailar.getState())
		{
			resultado = resultado + "Bailar\n";
		}
		if(chkFutbol.getState())
		{
			resultado = resultado + "Fútbol\n";
		}
		if(chkTenis.getState())
		{
			resultado = resultado + "Tenis\n";
		}
		if(chkBaloncesto.getState())
		{
			resultado = resultado + "Baloncesto\n";
		}
		if(chkVela.getState())
		{
			resultado = resultado + "Deportes de Vela\n";
		}
		if(resultado.equals("Has elegido:\n"))
		{
			resultado = "No has elegido ninguno";
		}
		System.out.println(resultado);
	}
}
