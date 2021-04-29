package varaukset;

import java.io.File;
import java.util.ArrayList;


public class Varaus {
	
	private boolean varattu;
	
	public Varaus(int paikka, int näytös) {
			
		
		
	}


	ArrayList<Varaus> v = new ArrayList<>();
	
	File f = new File("varaukset.txt");
	 


public void lisääVaraus(int paikka, int näytös) {
			
	Varaus varaus = new Varaus(paikka, näytös);	
	v.add(varaus);	
	}		
}






