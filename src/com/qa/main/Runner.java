package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		Results r = new Results();
		
		r.calcBiology(100);
		r.calcPhysics(150);
		r.calcChemistry(85);
		r.checkFailures();
	}
	
}
