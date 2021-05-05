package julie.emi.models;

public class Thief extends Enemy
{

	public Thief(String name, int monsterLvl)
	{
		super(name, monsterLvl, 20+(monsterLvl*2), 10+(monsterLvl), 5+(monsterLvl));
		
	}
	@Override
	public void parle()
	{
		System.out.println(name + " dit : Wesh, donne ton porte monnaie ou je te détruit");
	}
	
}
