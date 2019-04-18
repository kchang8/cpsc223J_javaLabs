//Kailie Chang
//CPSC 223J TuTh 8:00AM
//Lab 7
//Nested Classes and Enumeration

public class lab7 {

	public static void main(String[] args) {
		Patient Timmy = new Patient();
		System.out.println("Patient ID: " + Timmy.getID() + 
				"\nPatient Age: " + Timmy.getAge());
		Timmy.displayBlood();
		
		Patient Spike = new Patient(1337, 19, RhFactor.NEGATIVE, BloodType.AB);
		System.out.println("Patient ID: " + Spike.getID() +
				"\nPatient Age: " + Spike.getAge());
		Spike.displayBlood();
	}

}
