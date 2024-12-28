package com.animal.bird.copy;


public class Hummingbird extends FlyingBird {
	private static final String CALL = "CHEEP!  CHEEP!";
	private static final String PLUMAGE = "green feathers with red breast";
	private static final String LATIN_NAME = "Calypte anna";
	private static final String ENGLISH_NAME = "Anna's hummingbird";
	private static final int HEIGHT = 10; //centimeters
	private static final int WEIGHT = 5; //grams 
	public Hummingbird() {
		super(ENGLISH_NAME, WEIGHT, HEIGHT, CALL, PLUMAGE);
	}

	@Override
	public int getWingspan() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMaxSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void flyAway() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEnglishAndLatinName() {
		// TODO Auto-generated method stub
		return this.getName() + " (" + this.getLatinName() + ")";
	}

	@Override
	public String getDietInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String latinName() {
		// TODO Auto-generated method stub
		return LATIN_NAME;
	}
	
}
