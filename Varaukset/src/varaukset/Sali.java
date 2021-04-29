package varaukset;
/** Salissa on paikkoja näytöksiin. Näytöksissä näytetään elokuvia
*	Näytös annetaan numerona
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
	
	public void varaaPaikka(int paikka, int näytös) {
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
	


