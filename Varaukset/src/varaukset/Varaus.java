package varaukset;

import java.io.File;
import java.util.ArrayList;


public class Varaus {
	
	private boolean varattu;
	
	public Varaus(int paikka, int n�yt�s) {
			
		
		
	}


	ArrayList<Varaus> v = new ArrayList<>();
	
	File f = new File("varaukset.txt");
	 


public void lis��Varaus(int paikka, int n�yt�s) {
			
	Varaus varaus = new Varaus(paikka, n�yt�s);	
	v.add(varaus);	
	}		
}






