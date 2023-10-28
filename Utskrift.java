package no.hvl.dat100;d

public class Utskrift {

//	 Har ansvar for utskrift av en simulering. Svarene skrives ut på skjermen 
//	 slik det er indikert ovenfor. En viktig design beslutning er i hvilken 
//	 klasse statistikken skal beregnes.
	
	
	public static void main(String[] args) {
		
		System.out.println("TERNINGKASTSIMULATOR \n");
		
		for (int i[] : Simulering.tabell) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		//System.out.print(Arrays.deepToString(Simulering.settInnITabell()));
		
		System.out.println();
		System.out.println("Antall kast   : 100");
		Simulering.hvorMangePerVerdi();
		System.out.println();
		System.out.println("Gjennomsnittskast: "+ Simulering.gjennomsnitt() + "\n");
		System.out.println("Antall kast for å få den første 6-eren :" + Simulering.forsteSekser() + "\n");
		System.out.println("Terningverdi det var flest av : " + Simulering.flestAv() + "\n");
	}

}

