package no.hvl.dat100;

public class Simulering {

//	Representerer resultater fra én simulering. Verdiene/kastene legges inn i en tabell 
//	med plass til 100 elementer . Metodene i klassen skal finne ut hvor mange kast 
//	det ble av hver verdi og legge de i en tabell med plass til seks elementer. 
//	Nøtt: Prøv å få til det siste uten å bruke if eller switch.	
	int antallRader;
	int antallKolonner;
	int[][] tabell;
	
	public Simulering() {
		antallRader = 5;
		antallKolonner = 20;
		tabell = new int[antallRader][antallKolonner];
	}
	
	public int[][] settInnITabell() {
//		Metode som triller en terning 100 ganger og setter tallene inn i en tabell
		
		Terning terning = new Terning();
	    int[][] tabell = new int[5][20];

	    for (int rad = 0; rad < 5; rad++) {
	        for (int kolonne = 0; kolonne < 20; kolonne++) {
	        	terning.trill();
	            tabell[rad][kolonne] = terning.getOyne();
	        }
	    }

	    return tabell;
	}
	
	public int[] tabellAvVerdier() {
//		Metode som lager og returnerer en tabell av hvor mange av per verdi som har blitt
//		kastet. Husk: Enere står på plass 0, Toere på plass 1 osv...
		
		int[] tabellAvVerdier = new int[6];

		    for (int i = 0; i < tabell.length; i++) {
		        for (int j = 0; j < tabell[i].length; j++) {
		            
		            for (int verdi = 1 ; verdi <= 6 ; verdi++) {
						if (tabell[i][j] == verdi) {
							tabellAvVerdier[verdi-1]++;
						}
					}
		        }
		    }
		   return tabellAvVerdier; 
	}
	
	public void hvorMangePerVerdi() {
//		Metode som printer ut hvor mange av per verdi (1-ere til 6-ere) som blir kastet
		
		
		int[] tabellAvVerdier = tabellAvVerdier();
		
		 // Skriv ut antall kast per verdi
	    for (int i = 0; i < tabellAvVerdier.length; i++) {
	        int verdi = i + 1;
	        System.out.println("Antall " + verdi + "-ere: " + tabellAvVerdier[i]);
	    }	
	}

	public double gjennomsnitt() {
//		metode som finner og returnerer gjennomsnittet på terningene på de 100 kastene 

		int tilsammen = 0;
		double gjennomsnittskast = 0;
		
		for (int i[] : tabell) {
			for (int j : i) {
				tilsammen += j;
				gjennomsnittskast = tilsammen / 100;
			}
		}
		return gjennomsnittskast;
	}
	
	public int forsteSekser() {
//		Metode som finner den første sekseren i tabellen og returnerer antall kast for å 
//		finne denne sekseren
		
		int antallTrill = 0;
		
		for (int i = 0 ; i < tabell.length ; i++) {
			for (int j = 0 ; j < tabell[i].length ; j++ ) {
				antallTrill++;
				
				if (tabell[i][j] == 6) {
					return antallTrill;
				
				}
			}
		}
		return -1;	
	}

	public int flestAv() {
		//Metode som finner hvilket tall som ble oftest trilt på terningen i simulatoren
		
		int[] tabellAvVerdier = tabellAvVerdier();
		
		int flestAv = 1;
		
		for (int i = 0 ; i < tabellAvVerdier.length; i++) {
			if (i < tabellAvVerdier.length-1 && tabellAvVerdier[i+1] > tabellAvVerdier[i]) {
				flestAv = i+2;
			}
		}
		return flestAv;
		
	}
		
}
