package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		Results r = new Results();
		
		int biology = 100;
		int physics = 150;
		int chemistry = 80;
		
		r.calcBiology(biology);
		r.calcPhysics(chemistry);
		r.calcChemistry(physics);
		r.calcPercentageForAll(biology, chemistry, physics);
		r.checkFailures();
	}
	
}
