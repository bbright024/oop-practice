package com.animal.copy;

public abstract class Animal {
	private String name;
	private Gender gender;
	private int weight;
	private int height;
	private String latinName;
	public String getName() {
		return name;
	}
	public Gender getGender() {
		return this.gender;
	}
	public double getWeightInGrams() {
		return this.weight;
	}
	public double getHeightInCm() {
		return this.height;
	}
	
	public Animal(String name) {
		this.name = name;
		this.gender = randomizeGender();
		
	}
	public Animal(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}
	public Animal(String name, int weight, int height) {
		this(name);
		this.weight = weight;
		this.height = height;
		this.latinName = this.latinName();
	}
	public Animal(String englishName, String latinName) {
		this.latinName = latinName;
		this.name = englishName;
	}
	
	private Gender randomizeGender() {
		double rand = Math.random();
		Gender gender = (rand < 0.5) ? Gender.MALE : Gender.FEMALE;
		return gender;
	}
	public String getLatinName() {
		return this.latinName;
	}
	public abstract String getEnglishAndLatinName();
	public abstract String getDietInfo();
	public abstract String latinName();

	
}
