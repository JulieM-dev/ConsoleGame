package julie.emi.models;

public abstract class Enemy
{
	public String name;
	public int type;
	int monsterLvl;
	int monsterHp;
	int monsterAtk;
	int monsterDef;
	
	public Enemy(String name, int type, int monsterLvl, int monsterHp, int monsterAtk, int monsterDef)
	{
		this.name = name;
		this.type = type;
		this.monsterLvl = monsterLvl;
		this.monsterHp = monsterHp;
		this.monsterAtk = monsterAtk;
		this.monsterDef = monsterDef;
		
	}
}
