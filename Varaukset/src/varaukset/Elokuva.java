
package varaukset;


public class Elokuva {

	/**T�h�n m��ritell��n eri esitett�v�t elokuvat
	 * Nimi stringin� ja pituus int minuutteina
	*/
	
	
	
	
	
	public Elokuva(String nimi, int pituus) {
		this.nimi = nimi;
		this.pituus = pituus;
		
	}

	private String nimi;
	private int pituus;
	
	
	
	
	public void asetaElokuva(String nimi, int pituus) {
		this.nimi=nimi;
		this.pituus=pituus;		
	}
	
	public void asetaNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public void asetaPituus(int pituus) {
		this.pituus = pituus;
	}
	
	public String annaNimi() {
		return nimi;
	}
	
	public int annaPituus() {
		return pituus;
	}
	
	
}
