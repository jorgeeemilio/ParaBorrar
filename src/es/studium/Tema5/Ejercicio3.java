package es.studium.Tema5;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio3 implements ActionListener, WindowListener
{
	Frame ventana = new Frame("Calcular el IVA");
	Label lblCantidad = new Label("Introduzca la cantidad");
	Label lblPorcentaje = new Label("Introduzca el porcentaje");
	Label lblResultado = new Label("Resultado");
	TextField txtCantidad = new TextField(10);
	TextField txtPorcentaje = new TextField(10);
	TextField txtResultado = new TextField(20);
	Button btnCalcular = new Button("Calcular");

	Ejercicio3()
	{
		ventana.setLayout(new FlowLayout());
		ventana.addWindowListener(this);
		// Establecemos el tamaño
		ventana.setSize(850, 75);
		// añadimos los componentes
		ventana.add(lblCantidad);
		ventana.add(txtCantidad);
		ventana.add(lblPorcentaje);
		ventana.add(txtPorcentaje);
		btnCalcular.addActionListener(this);
		ventana.add(btnCalcular);
		ventana.add(lblResultado);
		txtResultado.setEnabled(false);
		ventana.add(txtResultado);
		ventana.setLocationRelativeTo(null);
		// Hacemos visible la pantalla
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio3();
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
		int cantidad = Integer.parseInt(txtCantidad.getText());
		int porcentaje = Integer.parseInt(txtPorcentaje.getText());
		float resultado = (float)(cantidad*porcentaje)/100;
		txtResultado.setText(resultado+"");
	}
}
