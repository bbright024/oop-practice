package com.animal.bird;

import java.util.List;
import java.util.ArrayList;

public class BirdDriver {
	public static void main(String[] args) {
		Bird grosbeak = new Grosbeak(); 
		Bird hummingbird = new Hummingbird();
		List<Bird> birds = new ArrayList<>();
		birds.add(grosbeak);
		birds.add(hummingbird);
		for (Bird b : birds) {
			System.out.println(b.getBirdCall());
			System.out.println(b.getEnglishAndLatinName());
		}

	}
}
