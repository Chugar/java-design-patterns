package com.chugar.patterns.observer;

public class Client implements Observer<Magasin> {
	
	// On s'en fout de ce qu'il y a ici
	

	public void update(Magasin magasin) {
		System.out.printf(
				"Le magasin %s vient de mettre a jour ses prix", 
				magasin.getId()
				
				);
		
	}

}
