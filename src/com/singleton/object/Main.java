package com.singleton.object;

public class Main {

	public static void main(String[] args) {
		SingleTonConcept sc = SingleTonConcept.getInstance();
		SingleTonConcept sc1 = SingleTonConcept.getInstance();
		System.out.println(sc);
		System.out.println(sc1);
	}

}
