package com.animal.bird;

import com.animal.Flying;

public class Grosbeak extends FlyingBird implements Flying {
	private static final String CALL = "Kiiiioo!  Euuuweeaaahhhh? Kiiioo!";
	private static final String PLUMAGE = "black head with orange wings";
	private static final String LATIN_NAME = "Pheucticus melanocephalus";
	private static final String ENGLISH_NAME = "black-headed grosbeak";
	private static final int HEIGHT = 19; //centimeters
	private static final int WEIGHT = 47; //grams 
	public Grosbeak() {
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
	public String getDietInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getEnglishAndLatinName() {
		// TODO Auto-generated method stub
		return this.getName() + " (" + this.getLatinName() + ")";
	}
	@Override
	public String latinName() {
		// TODO Auto-generated method stub
		return LATIN_NAME;
	}

}
