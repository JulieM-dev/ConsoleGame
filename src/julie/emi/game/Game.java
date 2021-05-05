package julie.emi.game;

import java.util.ArrayList;
import java.util.Scanner;

import julie.emi.models.Enemy;
import julie.emi.models.Player;
import julie.emi.models.GameState;

public class Game
{
	//Variables
	private Player player;
	private ArrayList<Enemy> ennemies;
	private GameState state;
	
	//Fonctions métiers
	public void movement()
	{
		System.out.println("Par ou souhaitez vous vous déplacer ?");
		System.out.println("Appuyez sur Z pour avancer tout droit");
		Scanner choice = new Scanner(System.in);
		String move = choice.next();
		if (move.equals("z"))
		{
			
		}
	}
	
	
	public void run()
	{
		
		while (player.getPv()>0)
		{
			
		}
	}
	
	
	
	//Constructeur
	public Game(Player player)
	{
		
	}
	
	//Getters
	public Player getPlayer()
	{
		return this.player;
	}
	
	public GameState getState()
	{
		return this.state;
	}
}
