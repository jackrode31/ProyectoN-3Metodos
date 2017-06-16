import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Biseccion {

	
	public static Object[] solve(PolinomialFunc f,double a, double b)
	{
		double error=0.0001;
		int i= 0;
		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);
		ArrayList<String> iOut=new ArrayList<String>();
		ArrayList<String> aOut=new ArrayList<String>();
		ArrayList<String> faOut= new ArrayList<String>();
		ArrayList<String> bOut= new ArrayList<String>();
		ArrayList<String> fbOut=new ArrayList<String>();
		ArrayList<String> fafxrOut=new ArrayList<String>();
		ArrayList<String> xrOut=new ArrayList<String>();
		ArrayList<String> fxrOut=new ArrayList<String>();
		double xr;
		double xrLast;
		do{
			
			xr=(a+b)/2.0;
			xrLast = xr;
			double fa=f.evaluate(a);
			double fb=f.evaluate(b);
			double fxr=f.evaluate(xr);
			iOut.add(""+i++);
			aOut.add(df.format(a));
			bOut.add(df.format(b));
			faOut.add(df.format(fa));
			fbOut.add(df.format(fb));
			fafxrOut.add(df.format(fa*fxr));
			xrOut.add(df.format(xr));
			fxrOut.add(df.format(fxr));
			if((fa*fxr)<0)
			{
				b=xr;
			}
			else
			{
				if((fa*fxr)>0)
				{
					a=xr;
				}
				else
				{
					return new Object[]{xr,pruebaEscritorio(iOut,aOut,faOut,bOut,fbOut,fafxrOut,xrOut,fxrOut)};
				}
			}
		
			
		}while((Math.abs(xr-xrLast)/Math.abs(xr))<=error);
		return new Object[]{xr,pruebaEscritorio(iOut,aOut,faOut,bOut,fbOut,fafxrOut,xrOut,fxrOut)};
		
	}
	
	
	public static String[][] pruebaEscritorio(ArrayList<String>c1,ArrayList<String>c2,ArrayList<String>c3,ArrayList<String>c4,
			ArrayList<String>c5,ArrayList<String>c6,ArrayList<String>c7,ArrayList<String>c8) 
	{
		String[][] out = new String[c1.size()][4];
		for(int r=0;r<c1.size();r++)
		{
				out[r][0]=c1.get(r);
				out[r][1]=c2.get(r);
				out[r][2]=c3.get(r);
				out[r][3]=c4.get(r);
				out[r][4]=c4.get(r);
				out[r][5]=c5.get(r);
				out[r][6]=c6.get(r);
				out[r][7]=c7.get(r);
		}
		return out;
		
	}
	

}
