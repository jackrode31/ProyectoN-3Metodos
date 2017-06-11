import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Biseccion {
	public PolinomialFunc func;
	double a,b;
	static double z;
	double xr;
	static double aEvaluation;
	static double XREvaluation;
	

	public void XR(){
		
		xr=((a+b)/(2));
	}
	
	/*public void aFunctionEvaluation(){
		aEvaluation = func.evaluate(a);
		System.out.println(aEvaluation);
		
	}*/
	
	/*public void XRFunctionEvaluation(){
		XREvaluation = func.evaluate(xr);
		System.out.println(XREvaluation);
	}*/
	
	
	static public void XRporA(){
		
		z= aEvaluation*XREvaluation;
	}
	
	
	
	public double[] Evaluacion(double a, double b)
	{
		this.a=a;
		this.b=b;
		double errLast = 0;
		
		do
		{
			
			aEvaluation = func.evaluate(a);
			XREvaluation = func.evaluate(xr);
			//errLast=
					
			if(z>0){
				
			}
			
		}while(errLast>0.0001);
		return new double[]{aEvaluation, XREvaluation};
}
}
