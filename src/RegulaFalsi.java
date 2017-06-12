
public class RegulaFalsi {

	public PolinomialFunc func;
	double a,b, xr, fa,fxr,fb;
	static double bEvaluation, aEvaluation, xrEvaluation, z; 
	
	
	public double[] Evaluacion(double a, double b)
	{
		this.a=a;
		this.b=b;
		double errLast = 0;
		
		do
		{
			
			aEvaluation = func.evaluate(a);
			bEvaluation = func.evaluate(b);
			xr=(b-(bEvaluation*(a-b))/(aEvaluation-bEvaluation));
			xrEvaluation=func.evaluate(xr);
			//errLast=
					
			if(xrEvaluation>0){
				a=xr;	
			}
			else
				{
				b=xr;
				}
			
		}while(errLast>0.0001);
		return new double[]{a, b, aEvaluation, bEvaluation,(aEvaluation*xrEvaluation),xrEvaluation,errLast };
}
	
	
	public void xr(){
		xr=b-(fb*(a-b))/(fa-fb);
	}
	
	
}
