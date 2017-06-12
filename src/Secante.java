
public class Secante {
	
	public static Object[] solve (PolinomialFunc f, double x0, double x1) throws Exception
	{
		double xn;
		int n=1,nmax=1000 ;
		double error=0.01;
		boolean stop=false;
		do
		{
			xn= x1-(f.evaluate(x1)*(x0-x1)/(f.evaluate(x0)-f.evaluate(x1)));
			if(Math.abs(xn-x0)/Math.abs(xn)<=error)
			{
				stop=true;
			}
			else
			{
				if(n>nmax)
				{
					throw new Exception("Se alcanzo el maximo de iteraciones.");
				}
			}
		}while(!stop);
		
		return new Object[] {xn,xn};
	}

}
