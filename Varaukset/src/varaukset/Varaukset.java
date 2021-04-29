package varaukset;

import java.util.ArrayList;

public class Varaukset extends Sali{

		
	public Varaukset(int paikka, boolean varattu, int näytös) {
		super(paikka, varattu, näytös);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Varaukset> varaus;
	
	
	
	//Luovaraus luo uuden varauksen
	private static void luoVaraus(int paikat, int paikka, boolean varattu, int näytös) {
		Varaus v = new Varaus(Elokuva e, paikka, näytös);
		
	}
	
	
	
	private static void poistaVaraus()
	
	
	public void asetaVaraus(ArrayList<Varaukset> varaus) {
		this.varaus=varaus;
	}
	
	public ArrayList<Varaukset> annaVaraus(){
		return varaus;
	}


	
}
