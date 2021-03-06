﻿import javax.swing.JOptionPane;

import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainProyectoN3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		MenuPrincipal();
	}
	static void MenuPrincipal(){
		int opcion=0;
		do{
			opcion=0;
			try{
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Pagina de Presentacion.\n "
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
			case 4: System.exit(0);break;
			default: JOptionPane.showMessageDialog(null, "Opcion invalida.");
			}
		}while(opcion!=4);
	}
	
	

	static void PaginaDePresentacion(){

		ImageIcon presentacion = new ImageIcon(
				new ImageIcon(
						MainProyectoN3.class.getClassLoader().getResource("presentacion.jpg")).getImage().getScaledInstance(556,720, Image.SCALE_DEFAULT));
		JOptionPane.showMessageDialog(null, presentacion);
	}
	
	
	
	static void ClosedMethodMenu(){
		
		int opcion =0;
		do{
			opcion=0;
			try{
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Metodo de RegulaFalsi \n"
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
			case 1: MetodoSecante();break;
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
		
		Object[] solution=RegulaFalsi.solve(new PolinomialFunc(funcCoef),a,b);
		
		JOptionPane.showMessageDialog(null,"Raiz del Polinomio:"+solution[0]);
		matrixResult print = new matrixResult((String[][])solution[1],new String[] {"Iter","a","b","f(xn)","f(a)","f(b)","Error Relativo"});
		print.showme();
		
		
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
		try{
		Object[] solution=Secante.solve(new PolinomialFunc(funcCoef),a,b);
		
		JOptionPane.showMessageDialog(null,"Raiz del Polinomio:"+solution[0]);
		matrixResult print = new matrixResult((String[][])solution[1],new String[] {"n","xn","f(xn)","f(xn+1)","Error Relativo"});
		print.showme();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Se Alcanzo el maximo de iteraciones");
		}
	}
}
