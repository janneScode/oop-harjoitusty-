

package varaukset;

import java.io.IOException;
import java.util.InputMismatchException;

import java.util.Scanner;


public class Valikko {
			
	private int taso;
	


	
	
	public void tulostaValikko0() {
		System.out.println("1. Tee varaus");
		System.out.println("2. Poista varaus");		
		System.out.println("3. Tulosta varaukset");
		
		int valinta = lueNumerot();
		if(valinta == 1) {
			tulostaValikko1();
		}
		if(valinta == 2) {
			tulostaValikko2();
		}
		if(valinta == 3) {
			tulostaValikko3();
		}
		else {
			System.out.println("Syötä validi luku");
			tulostaValikko0();
		}
		asetaValikonTaso(valinta);
	}
	
	public void tulostaValikko1() {
		System.out.println("1. Valitse elokuva");
		System.out.println("2. Palaa");		
		int valinta = lueNumerot();		
		asetaValikonTaso(valinta);
		
	}
		
	

	public void tulostaValikko2() {
				
		System.out.println("1. Rambo1");
		System.out.println("2. Rambo2");				
		int valinta = lueNumerot();		
		asetaValikonTaso(valinta);
	}
	
	public void tulostaValikko3() {
		System.out.println("1. Rambo1");
		System.out.println("2. Rambo2");				
		int valinta = lueNumerot();		
		asetaValikonTaso(valinta);
		
		
	}
	
	
	
	public int lueNumerot() throws InputMismatchException {
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		return numero;
	}
	
	
	
	
	
	public void asetaValikonTaso(int taso) {
		this.taso=taso;			
	}
	
	public int annaValikonTaso(){						
		return taso;
			
	}
		
	
		
}

	
	


