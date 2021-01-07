package com.qa.main;

public class Results {

	int failCounter = 0;
	
	public void calcBiology(int biology) {
		double biologyP = biology*100/150;
		System.out.println("Biology percentage: " + biologyP + "%");
		checkFailedExam(biologyP);
	}
	
	public void calcChemistry(int chemistry) {
		double chemistryP = chemistry*100/150;
		System.out.println("Chemistry percentage: " + chemistryP + "%");
		checkFailedExam(chemistryP);
	}

	public void calcPhysics(int physics) {
		double physicsP = physics*100/150;
		System.out.println("Physics percentage: " + physicsP + "%");
		checkFailedExam(physicsP);
	}
	
	public void checkFailedExam(double percentage) {
		if (percentage < 60) {
			failCounter++;
		}
	}
	
	public void checkFailures() {
		if (failCounter == 1) {
			System.out.println("You've failed one exam!");
		} else if (failCounter == 2) {
			System.out.println("You've failed two exams!");
		} else if (failCounter == 3) {
			System.out.println("You've failed three exams!");
		} else {
			System.out.println("You've passed!");
		}
	}
	
}
