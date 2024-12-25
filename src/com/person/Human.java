package com.person;
import java.util.Date;

public class Human {
	private String name;
	private Date birthday;
	private int heightInInches;
	private int  weightInPounds;
	private ArrayList<Pet> pets;
	private Car car;
	private Home home;
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public ArrayList<Pet> getPets() {
		return pets;
	}


	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public Cigarrete getCigarette() {
		return cigarette;
	}


	public void setCigarette(Cigarrete cigarette) {
		this.cigarette = cigarette;
	}
	private Cigarrete cigarette;
	public static final double POUNDS_KILO_RATIO = 0.45359;
	public static final double INCHES_CENTI_RATIO = 2.54;
	
	public Human (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public double calculuateWeightInKilos() {
		return this.weightInPounds * POUNDS_KILO_RATIO;
	}
	public double heightInCentimeters() {
		return this.heightInInches * INCHES_CENTI_RATIO;
	}
	
	
}
