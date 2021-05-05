package julie.emi.models;

public abstract class Enemy
{
	public String name;
	int monsterLvl;
	int monsterHp;
	int monsterAtk;
	int monsterDef;
	
	public Enemy(String name, int monsterLvl, int monsterHp, int monsterAtk, int monsterDef)
	{
		this.name = name;
		this.monsterLvl = monsterLvl;
		this.monsterHp = monsterHp;
		this.monsterAtk = monsterAtk;
		this.monsterDef = monsterDef;
		
	}
	
	public void parle()
	{
		System.out.println("Salut je suis méchant");
	}
	public int getAtk()
	{
		return this.monsterAtk;
	}
	public int getDef()
	{
		return this.monsterDef;
	}
	public int getHp()
	{
		return this.monsterHp;
	}
	
	//public String toString()
	//{
		
	//}
}
