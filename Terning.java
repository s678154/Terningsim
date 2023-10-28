package no.hvl.dat100;

import java.util.Random;

public class Terning {

	// aktuell verdi for terningen
	private int oyne;

	public Terning() {
		trill();
	}

	public int getOyne() {

		return oyne; 
	}

	public void trill() {
		Random random = new Random();
		
		oyne = random.nextInt(7);
	}
}
