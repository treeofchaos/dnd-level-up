package com.zackary;
public class Player 
{
	private static String classes="";
	private static String subclass="";
	private static int newLevel=0;
	private static int currentLevel=0;
	
	public static void setClass(String c)
	{
		classes=c;
	}
	public String getClasses()
	{
		return classes;
	}
	public static void setSubClass(String sc)
	{
		subclass=sc;
	}
	public String getSubClass()
	{
		return subclass;
	}
	public static void setNewLevel(int nl)
	{
		newLevel=nl;
	}
	public int getNewLevel()
	{
		return newLevel;
	}
	public static void setCurrentLevel(int cl)
	{
		currentLevel=cl;
	}
	public int getCurrentLevel()
	{
		return currentLevel;
	}
	public void levelUp()
	{
		
	}
}