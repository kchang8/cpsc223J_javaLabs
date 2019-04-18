
public enum BloodType {
	O("O"), A("A"), B("B"), AB("AB");
	
	private String blood;
	
	private BloodType(String bloodType)
	{
		blood = bloodType;
	}
	
	public String getBlood()
	{
		return blood;
	}
}
