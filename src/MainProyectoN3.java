import javax.swing.JOptionPane;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainProyectoN3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		Biseccion biseccion = new Biseccion();
		
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
			case 1: PresentationPague();break;
			case 2: ClosedMethodMenu();break;
			case 3: //OpenMethodMenu();break;
			case 4: System.exit(0);
			default: JOptionPane.showMessageDialog(null, "Opcion invalida.");
			}
		}while(opcion!=3);
	}
	
	
	static void PresentationPague(){
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
			case 1: MetodoBiseccion();
			case 2: continue;
			
			}
		}while (opcion!=2);
		
		Biseccion.XRporA();
		
	}
	
	
	static void MetodoBiseccion()
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
		
	/*
	static void OpenMethodMenu()
	{
		DoolittleProcedure d = new DoolittleProcedure(equatioInput());
		double resultado[] =d.solveSystem();
		int opcion =0;
		do{
			opcion=0;
			try{
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Metodo Regula Falsi \n"
						+ "2. Metodo Secante \n"
						+ "3. Regresar al Menu Principal \n"));
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Error. Introduzca una de las opciones.");
			}
			switch(opcion)
			{
			case 1:
				{
					
					new matrixInput(d.getSystemCoefArray(),d.getSytemFreeTermArray()).showme();;
				}
				break;
			case 2: 
				new matrixResult(d.getSup(),0).showme();
			
				break;
			case 3: 
				new matrixResult(d.getInf(),0).showme();
				break;
				
			
			}
	}while (opcion!=0);
	}
	
	static void MetodoBiseccion()
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
		String flag;
			flag = JOptionPane.showInputDialog(null, "Desea hacer la aproximacion con la restriccion de que la serie \n "
					+ "pare cuando el error en el n-esimo termino sea menor a 0.0001 (s)/n");

		
		TaylorAproxFunc aproximation = new TaylorAproxFunc();
		aproximation.func= new PolinomialFunc(new ArrayList<Double>(funcCoef));
		double resp[];
		if(flag.equals("n"))
		{
			System.out.println(flag);
			resp = aproximation.aprox(x, x0,"");
		}
		else
		{
			resp=aproximation.aprox(x, x0);
		}
		int op = 0;
		do
		{
			op=0;
				try
				{
					op=Integer.parseInt(JOptionPane.showInputDialog(null, "Menu 3\n\t "
							+ "Error por Truncamiento\n\t"
							+ "1. Error cometio en el n-esimo termino\n"
							+ "2. Valor aproximado de la funcion\n"
							+ "3. Valor exacto de la funcion\n"
							+ "4. Error Absoluto\n"
							+ "5. Error relativo Porcentual \n"
							+ "6. Regresar al menu 1"));
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Error, no ha introducido un numero.");
					continue;
				}
				switch(op)
				{
				case 1:
					JOptionPane.showMessageDialog(null, "El error en el nesimo termino fue de: "  + resp[1]);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "El Valor Aproximado de la funcion: "  + resp[0]);
					break;
				case 3 :
					JOptionPane.showMessageDialog(null, "El valor exacto de la funcion: "  + resp[2]);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Error Absoluto: "  + resp[3]);
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Error Relativo: "  + resp[4]);
					break;
				}
		}while(op!=6 );
		
	}*/
	
}
