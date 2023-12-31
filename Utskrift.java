package no.hvl.dat100;

public class Utskrift {

//	 Har ansvar for utskrift av en simulering. Svarene skrives ut på skjermen 
//	 slik det er indikert ovenfor. En viktig design beslutning er i hvilken 
//	 klasse statistikken skal beregnes.
	
	
	public static void main(String[] args) {
		
		Simulering sim = new Simulering();
		sim.settInnITabell();
		
		
		System.out.println("TERNINGKASTSIMULATOR \n");
		sim.skrivUt();
		System.out.println("\nAntall kast: " + sim.antallKast());
		sim.hvorMangePerVerdi();
		System.out.println("\nGjennomsnittskast: "+ sim.gjennomsnitt() + "\n");
		System.out.println("Antall kast for å få den første 6-eren: " + sim.forsteSekser() + "\n");
		System.out.println("Terningverdi det var flest av: " + sim.flestAv() + "\n");
	}

}

