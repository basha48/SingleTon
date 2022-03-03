package com.singleton.object;

public class SingleTonConcept {

	private static SingleTonConcept instance;
	
	private SingleTonConcept() {

	}
	static synchronized SingleTonConcept getInstance() {
		if(instance == null ) {
			instance = new SingleTonConcept();
	}
		return instance;
	}
}
