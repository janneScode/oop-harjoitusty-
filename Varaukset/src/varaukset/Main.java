package varaukset;

import java.io.IOException;
import java.util.ArrayList;



//import varaukset.Peruskäyttäjä;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
			
			
		ArrayList<Varaus> vLista = new ArrayList<>();
		
		
		
		
		Varaus v = new Varaus(10, 11);
		Tiedosto t = new Tiedosto();
		try {
			t.tallennaVaraus(10,11);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Tiedosto t = new Tiedosto();
		//t.lueVaraukset();
		
		//Valikko v = new Valikko();
		//v.tulostaValikko0();
		
		
		Elokuva e1 = new Elokuva("Rambo1", 66);
		Elokuva e2 = new Elokuva("Rambo2", 70);
		
		
		
			
			
				
				
				
					   		
	}

}
