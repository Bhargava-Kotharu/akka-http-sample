package com.bkotharu.examples;

/**
 * User Entity
 * 
 */
public class User {
	private final String name;
	private final int age;
	private final String countryOfResidence;

	public User() {
		this.name = "";
		this.countryOfResidence = "";
		this.age = 1;
	}

	public User(String name, int age, String countryOfResidence) {
		this.name = name;
		this.age = age;
		this.countryOfResidence = countryOfResidence;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCountryOfResidence() {
		return countryOfResidence;
	}
}
