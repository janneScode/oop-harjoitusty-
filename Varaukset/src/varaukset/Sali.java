package varaukset;
/** Salissa on paikkoja n�yt�ksiin. N�yt�ksiss� n�ytet��n elokuvia
*	N�yt�s annetaan numerona
*/

public class Sali {

	
	private int paikka; //paikkanumero
	private boolean varattu; //onko paikka varattu
	
	
	
	
	public Sali(int paikka, boolean varattu) {
		this.paikka = paikka;
		this.varattu = varattu;	
	}
	
	
				
	/** Palauttaa paikan numeron, jos varaus onnistuu. 
	 * Palauttaa 0, jos ei onnistu
	 * @return
	 */
	
	public void varaaPaikka(int paikka, int n�yt�s) {
		this.paikka=paikka;
		this.setVarattu(true);
	}
	
	
	//Palauttaa vapaat paikat
	public int[] etsiVapaat() {
		int[] vapaat;
		for(int i=0; i<paikat; i++) {			
				if(varattu == false) {
					int[] vapaat = i;
					System.out.println(i);
				}
				
			}

		return vapaat;
		}


	public void setVarattu(boolean varattu) {
		this.varattu = varattu;
	}
		
		
}	
	


