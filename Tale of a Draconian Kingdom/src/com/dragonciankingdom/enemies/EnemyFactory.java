package com.dragonciankingdom.enemies;

public class EnemyFactory {

	public static String enemyName;

	// Enemy Stats.

	public static int enemyConstitution;
	public static int enemyDexterity;
	public static int enemyStrength;
	public static int enemyWisdom;
	public static int enemyIntelligence;

	// Specialized Stats.

	public static int enemyHealth = 100 + (enemyConstitution * 3);
	public static int enemyDamage = 40 + (enemyStrength * 2);
	public static int enemyArmor = 20 + (int)(enemyConstitution / 2);
	
	// Enemy Directory
	
	public static String[] tierOneRandomEncounter = {};
	public static String[] tierTwoRandomEncounter = {};
	public static String[] tierThreeRandomEncounter = {};
	public static String[] tierFourRandomEncounter = {};
	public static String[] tierFiveRandomEncounter = {};
	
	public EnemyFactory() {
		
	}
	
}
