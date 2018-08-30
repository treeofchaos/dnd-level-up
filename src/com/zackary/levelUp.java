package com.zackary;
import java.util.Scanner;
import com.zackary.classes.Barbarian;
public class levelUp extends Player
{
	private static Scanner scan;
	public static void main(String[] args) 
	{
		scan = new Scanner(System.in);
		String c="";
		String sc="";
		int nl=0;
		int cl=0;
		
		//Getting Data
		System.out.println("What class are you playing as?");
		c=scan.nextLine();
		c=c.toLowerCase();
		System.out.println("What level are you currently?");
		cl=scan.nextInt();
		System.out.println("What level are you leveling up to?");
		nl=scan.nextInt();
		if(nl>3)
		{
			System.out.println("What subclass are you? (archetype, college, ancestry, etc.)");
			sc=scan.nextLine();
			sc=sc.toLowerCase();
		}
		//Shipping off to other classes
		/*setClass(c);
		setSubClass(sc);
		setNewLevel(nl);
		setCurrentLevel(cl);*/
		
		if(c.equals("barbarian"))
		{
			new Barbarian(nl, cl, sc);
		}
	}
	
}
