package com.const_defen_copy;

import java.util.Date;

public class PlanetNODefensiveCopy {
	
	  private final double fMass;
	  private final String fName;
	  private final Date fDateOfDiscovery;

	
	public PlanetNODefensiveCopy (double aMass, String aName, Date aDateOfDiscovery) {
	     fMass = aMass;
	     fName = aName;
	     fDateOfDiscovery = aDateOfDiscovery;
	  }

	  public double getMass() {
	    return fMass;
	  }

	  public String getName() {
	    return fName;
	  }

	  public Date getDateOfDiscovery() {
	    return fDateOfDiscovery;
	  }
}
