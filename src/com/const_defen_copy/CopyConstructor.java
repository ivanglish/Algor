package com.const_defen_copy;


public final class CopyConstructor {

	  /**
	  * Regular constructor.
	  */
	  public CopyConstructor(double aMass, String aName) {
	    fMass = aMass;
	    fName = aName;
	  }

	  /**
	  * Copy constructor.
	  */
	  public CopyConstructor(CopyConstructor aCopyConstructor) {
	    this(aCopyConstructor.getMass(), aCopyConstructor.getName());
	    //no defensive copies are created here, since 
	    //there are no mutable object fields (String is immutable)
	  }

	  /**
	  * Alternative style for a copy constructor, using a static newInstance
	  * method.
	  */
	  public static CopyConstructor newInstance(CopyConstructor aCopyConstructor) {
	    return new CopyConstructor(aCopyConstructor.getMass(), aCopyConstructor.getName());
	  }

	  public double getMass() {
	    return fMass;
	  }

	  /**
	  * This is the only method which changes the state of a CopyConstructor
	  * object. If this method were removed, then a copy constructor
	  * would not be provided either, since immutable objects do not
	  * need a copy constructor.
	  */
	  public void setMass(double aMass){
	    fMass = aMass;
	  }

	  public String getName() {
	    return fName;
	  }

	  // PRIVATE
	  private double fMass;
	  private final String fName;

	  /** Test harness. */
	  public static void main (String... aArguments){
	    CopyConstructor m101 = new CopyConstructor(15.0, "M101");

	    CopyConstructor m101CopyOne = new CopyConstructor(m101);
	    m101CopyOne.setMass(25.0);
	    System.out.println("M101 mass: " + m101.getMass());
	    System.out.println("M101Copy mass: " + m101CopyOne.getMass());

	    CopyConstructor m101CopyTwo = CopyConstructor.newInstance(m101);
	    m101CopyTwo.setMass(35.0);
	    System.out.println("M101 mass: " + m101.getMass());
	    System.out.println("M101CopyTwo mass: " + m101CopyTwo.getMass());
	  }
	} 