package varaukset;

import java.util.ArrayList;

public class Varaukset extends Sali{

		
	public Varaukset(int paikka, boolean varattu, int n�yt�s) {
		super(paikka, varattu, n�yt�s);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Varaukset> varaus;
	
	
	
	//Luovaraus luo uuden varauksen
	private static void luoVaraus(int paikat, int paikka, boolean varattu, int n�yt�s) {
		Varaus v = new Varaus(Elokuva e, paikka, n�yt�s);
		
	}
	
	
	
	private static void poistaVaraus()
	
	
	public void asetaVaraus(ArrayList<Varaukset> varaus) {
		this.varaus=varaus;
	}
	
	public ArrayList<Varaukset> annaVaraus(){
		return varaus;
	}


	
}
