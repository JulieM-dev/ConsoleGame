package julie.emi.game;

import java.util.Scanner;

import julie.emi.models.Player;
import julie.emi.utils.Messages;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println(Messages.HELLO);
		System.out.println(Messages.WELCOME);
		Scanner sc = new Scanner(System.in);
		String nom = sc.next();
		Player player1 = new Player(nom);
		player1.calcPv(20);
		System.out.println("Bienvenue " + player1.leNomDuFDP + " pv : " + player1.getPv());
	}
}
