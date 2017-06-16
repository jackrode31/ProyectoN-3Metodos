import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Secante {
	
	public static Object[] solve (PolinomialFunc f, double x0, double x1) throws Exception
	{
		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);
		ArrayList<String> nOut=new ArrayList<String>();
		ArrayList<String> xnOut= new ArrayList<String>();
		ArrayList<String> fxnOut= new ArrayList<String>();
		ArrayList<String> fxn1Out=new ArrayList<String>();
		ArrayList<String> errOut = new ArrayList<String>();
		ArrayList<Double> xn = new ArrayList<Double>();
		
		int n=0,nmax=1000 ;
		double tolerancia=0.0001;
		double error;
		boolean stop=false;
		nOut.add(n+"");
		xn.add(x0);
		xnOut.add(df.format((xn.get(xn.size()-1))));
		fxnOut.add("");
		fxn1Out.add("");
		errOut.add("");
		xn.add(x1);
		xnOut.add(df.format((xn.get(xn.size()-1))));
		fxnOut.add(df.format(f.evaluate(xn.get(xn.size()-2))));
		fxn1Out.add(df.format(f.evaluate(xn.get(xn.size()-1))));
		n++;
		nOut.add(n+"");
		error=Math.abs(xn.get(xn.size()-1)-xn.get(xn.size()-2))/Math.abs(xn.get(xn.size()-1));
		errOut.add(df.format(error));
		System.out.println(n+"\t\t"+xn.get(xn.size()-2)+"\t\t"+f.evaluate(xn.get(xn.size()-2))+ "\t\t"+f.evaluate(xn.get(xn.size()-1)));
		do
		{
			
			n++;
			
			xn.add(xnCalc(f,xn.get(xn.size()-2),xn.get(xn.size()-1)));
			fxnOut.add(df.format(f.evaluate(xn.get(xn.size()-2))));
			fxn1Out.add(df.format(f.evaluate(xn.get(xn.size()-1))));
			xnOut.add(df.format((xn.get(xn.size()-1))));
			nOut.add(n+"");
			error=Math.abs(xn.get(xn.size()-1)-xn.get(xn.size()-2))/Math.abs(xn.get(xn.size()-1));
			errOut.add(df.format(error));
			if(error<=tolerancia)
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
		System.out.println(nOut.size()+" " +xnOut.size()+ " " + fxnOut.size() + " " + fxn1Out.size()+ " "+ errOut.size());
		//return new Object[] {xn,xn};
		return new Object[]{xn.get(xn.size()-1),pruebaEscritorio(nOut,xnOut,fxnOut,fxn1Out,errOut)};
	}
	
	public static double xnCalc(PolinomialFunc f,double x0, double x1)
	{

		return(x1-(f.evaluate(x1)*(x0-x1)/(f.evaluate(x0)-f.evaluate(x1))));
	}

	
	public static void main(String args[]) throws Exception
	{
		ArrayList<Double> coef = new ArrayList<Double>();
		coef.add(-4.0);
		coef.add(0.0);
		coef.add(1.0);
		PolinomialFunc f = new PolinomialFunc(coef);
		matrixResult print = new matrixResult((String[][])solve(f,4,3)[1],new String[] {"n","xn","f(xn)","f(xn+1)"," "});
		print.showme();
	}
	public static String[][] pruebaEscritorio(ArrayList<String>c1,ArrayList<String>c2,ArrayList<String>c3,ArrayList<String>c4,ArrayList<String>c5)
 
	{
		String[][] out = new String[c1.size()][5];
		for(int r=0;r<c1.size();r++)
		{
				out[r][0]=c1.get(r);
				out[r][1]=c2.get(r);
				out[r][2]=c3.get(r);
				out[r][3]=c4.get(r);
				out[r][4]=c5.get(r);
		}
		return out;
		
	}
}

