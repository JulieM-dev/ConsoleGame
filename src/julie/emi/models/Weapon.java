package julie.emi.models;

public class Weapon extends Loot
{
	int atkPoints;
	int weaponType;
	public Weapon(String name, int value, int atkPoints)
	{
		super(name, value);
		this.atkPoints = atkPoints;
		this.value = value;
	}
	 enum types 
	 {
	 	SWORD,
	 	AXE,
	 	HAMMER,
	 	LANCE,
	 }
 
}

