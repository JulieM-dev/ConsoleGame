package julie.emi.models;

public class Wolf extends Enemy
{

	public Wolf(int monsterLvl)
	{
		super("wolf", monsterLvl, 10, 5, 2);
		
	}
	
	@Override
	public void parle()
	{
		System.out.println("ouaf");
	}
	
}
