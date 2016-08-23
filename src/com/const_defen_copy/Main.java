package com.const_defen_copy;

import java.util.Date;

public class Main {
	
	
	public static void main(String[] args) {
		PlanetDefensiveCopy planet= new PlanetDefensiveCopy(100.20D, "nuevo_planeta", new Date());
		PlanetNODefensiveCopy planot= new PlanetNODefensiveCopy(100.20D, "nuevo_planeta", new Date());
		Date mia = planet.getDateOfDiscovery();
		Date mia2 = planot.getDateOfDiscovery();
		mia.setYear(1976);
		System.out.println(mia);
		System.out.println(planet.getDateOfDiscovery()); //Defensive copy
		
		mia2.setYear(1976);
		System.out.println(mia2);
		System.out.println(planot.getDateOfDiscovery()); //No Defensive copy
	}
}
