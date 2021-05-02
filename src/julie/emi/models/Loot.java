package julie.emi.models;

public abstract class Loot
{
	String name;
	int value;
	int type;
	
	public Loot(String name, int value)
	{
		this.name = name;
		this.value = value;
	}
}
