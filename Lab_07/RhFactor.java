
public enum RhFactor {
	NEGATIVE('-'), POSITIVE('+');
	
	private char factor;
	
	private RhFactor(char rhFactor)
	{
		factor = rhFactor;
	}
	
	public char getFactor()
	{
		return factor;
	}
}
