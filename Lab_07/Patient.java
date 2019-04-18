
public class Patient {
	private int ID_number;
	private int age;
	private BloodData blood_data;
	
	//patient constructors
	public Patient()
	{
		this.ID_number = 0;
		this.age = 0;
		blood_data = new BloodData();
	}
	public Patient(int id, int ageNum, RhFactor myFactor, BloodType myBlood)
	{
		this.ID_number = id;
		this.age = ageNum;
		blood_data = new BloodData(myFactor, myBlood);
	}
	
	//getters
	public int getID()
	{
		return ID_number;
	}
	public int getAge()
	{
		return age;
	}
	
	//display function
	public void displayBlood()
	{
		System.out.println("Blood Type: " + blood_data.bType + blood_data.rFactor.getFactor());
	}
	
	public class BloodData
	{
		BloodType bType;
		RhFactor rFactor;
		public BloodData()
		{
			this.rFactor = RhFactor.POSITIVE;
			this.bType = BloodType.O;
		}
		public BloodData(RhFactor myFactor, BloodType myBlood)
		{
			this.rFactor = myFactor;
			this.bType = myBlood;
		}
		
	}
}
