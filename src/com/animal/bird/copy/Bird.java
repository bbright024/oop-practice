package com.animal.bird.copy;

import com.animal.Animal;

public abstract class Bird extends Animal {
	// returns the onomatopoeia of the bird's call
	private String birdCall;
	private String plumageColor;
	public String getBirdCall() {
		return this.birdCall;
	}
	public String getPlumageColor() {
		return this.plumageColor;
	}
	
	public Bird(String name, int weight, int height, String birdCall, String plumageColor) {
		super(name, weight, height);
		this.birdCall = birdCall;
		this.plumageColor = plumageColor;
	}
	
}
