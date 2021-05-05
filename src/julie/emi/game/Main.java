package julie.emi.game;

import java.util.ArrayList;
import java.util.Scanner;

import julie.emi.models.Enemy;
import julie.emi.models.Player;
import julie.emi.models.Thief;
import julie.emi.models.Wolf;
import julie.emi.utils.Messages;

public class Main 
{
	public static void main(String[] args)
	{
		ArrayList<Enemy> loups = new ArrayList<Enemy>();
		Enemy loupNoir = new Wolf(10);
		loupNoir.parle();
		loups.add(loupNoir);
		System.out.println("Ce puissant loup est : " + loups.get(0).name);
		Enemy bandit = new Thief("Robert", 20);
		bandit.parle();
		System.out.println("Stats du bandit " + bandit.name + " : " + "ATK " + bandit.getAtk() + " DEF " + bandit.getDef() + " HP " + bandit.getHp());
		System.out.println(Messages.HELLO);
		System.out.println(Messages.WELCOME);
		Scanner sc = new Scanner(System.in);
		String nom = sc.next();
		Player player1 = new Player(nom);
		player1.calcPv(20);
		System.out.println("Bienvenue " + player1.leNomDuFDP + " pv : " + player1.getPv());
		
	}
	
	public static void test()
	{
		System.out.println("Juste pour te montrer que Git c'est cool");
	}
}
