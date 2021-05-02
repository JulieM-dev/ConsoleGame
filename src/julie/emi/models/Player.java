package julie.emi.models;

public class Player
{
	public String leNomDuFDP;
	int pvMax;
	private int pv;
	int gold;
	
	public Player(String leNomDuFDP) 
	{
		this.leNomDuFDP = leNomDuFDP;
		this.pvMax = 50;
		this.pv = this.pvMax;
	}
	
	public void calcPv(int dmg)
	{
		this.pv = this.pv - dmg;
		if (this.pv < 0)
		{
			this.pv=0;
		}
	}
	
	public int getPv()
	{
		return this.pv;
	}
}
