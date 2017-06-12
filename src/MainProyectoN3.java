import javax.swing.JOptionPane;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainProyectoN3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		
		
		MenuPrincipal();
	}
	static void MenuPrincipal(){
		int opcion=0;
		do{
			opcion=0;
			try{
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Pagina de Presentación.\n "
						+ "2. Metodo Cerrado. \n "
						+ "3. Metodo Abierto.\n"
						+ "4. Salir del Programa.\n"));
			
				
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(null, "Por favor, selecciona algunas de las opciones en pantalla.");
			}
			switch(opcion)
			{
			case 1: PaginaDePresentacion();break;
			case 2: ClosedMethodMenu();break;
			case 3: OpenMethodMenu();break;
			case 4: System.exit(0);
			default: JOptionPane.showMessageDialog(null, "Opcion invalida.");
			}
		}while(opcion!=3);
	}
	
	
	static void PaginaDePresentacion(){
		ImageIcon presentacion = new ImageIcon(MainProyectoN3.class.getClassLoader().getResource("presentacion.jpg"));
		JOptionPane.showMessageDialog(null, presentacion);
	}
	
	
	
	static void ClosedMethodMenu(){
		
		int opcion =0;
		do{
			opcion=0;
			try{
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Metodo de Bisección \n"
						+ "2. Regresar al menu principal. \n"));
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Error. Introduzca una de las opciones.");
			}
			switch(opcion)
			{
			case 1: MetodoRegulaFalsi();
			case 2: continue;
			
			}
		}while (opcion!=2);
		
		
	}
	
static void OpenMethodMenu(){
		
		int opcion =0;
		do{
			opcion=0;
			try{
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Metodo Secante \n"
						+ "2. Regresar al menu principal. \n"));
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Error. Introduzca una de las opciones.");
			}
			switch(opcion)
			{
			case 1: MetodoSecante();
			case 2: continue;
			
			}
		}while (opcion!=2);
		
		
	}
	
	
	static void MetodoRegulaFalsi()
	{
		
		boolean error = false;
		ArrayList<Double> funcCoef= new ArrayList<Double>();
		double orderPol = 0;
		double a = 0;
		double b = 0;
		do
		{
			try
			{
				orderPol=Double.parseDouble(JOptionPane.showInputDialog(null, "Orden del Polinomio:"));
				error =false;
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Error, no ha introducido un numero.");
				error=true;
			}
		}while(error==true);	
		
		for(int i=0;i<=orderPol;i++)
		{
			 error = false;
			do
			{
				try
				{
					funcCoef.add(Double.parseDouble(JOptionPane.showInputDialog(null, "a0+a1X^1+a2X^2+...+anX^n"+ "\n"+"a"+(i)+":" )));
					error =false;
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Error, no ha introducido un numero.");
					error=true;
				}
			}while(error==true);	
		}	
		do
		{
			try
			{
				a= Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte el valor de a"));
				error =false;
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Error, no ha introducido un numero.");
				error=true;
			}
		}while(error==true);
		
		error = false;
		do
		{
			try
			{
				b= Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte el valor de b"));
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Error, no ha introducido un numero.");
				error=true;
			}
		}while(error==true);	
		
		
		
		
	}
		
	static void MetodoSecante()
	{
		
		boolean error = false;
		ArrayList<Double> funcCoef= new ArrayList<Double>();
		double orderPol = 0;
		double a = 0;
		double b = 0;
		do
		{
			try
			{
				orderPol=Double.parseDouble(JOptionPane.showInputDialog(null, "Orden del Polinomio:"));
				error =false;
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Error, no ha introducido un numero.");
				error=true;
			}
		}while(error==true);	
		
		for(int i=0;i<=orderPol;i++)
		{
			 error = false;
			do
			{
				try
				{
					funcCoef.add(Double.parseDouble(JOptionPane.showInputDialog(null, "a0+a1X^1+a2X^2+...+anX^n"+ "\n"+"a"+(i)+":" )));
					error =false;
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Error, no ha introducido un numero.");
					error=true;
				}
			}while(error==true);	
		}	
		do
		{
			try
			{
				a= Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte el valor de a"));
				error =false;
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Error, no ha introducido un numero.");
				error=true;
			}
		}while(error==true);
		
		error = false;
		do
		{
			try
			{
				b= Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte el valor de b"));
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Error, no ha introducido un numero.");
				error=true;
			}
		}while(error==true);	
	}
}
