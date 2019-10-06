package com.draconiankingdom.playerhandlers;
/**
 * This class outlines all the stats that exist in the game. This is where the initial
 * player gets set up after a name and type of dragon is chosen.
 * 
 * @author Zaezul
 *
 */

public class Player {

	// Player Leveling.
	
	public static int playerExp;

	// Player Id.

	public static String playerName;
	public static String playerDragon;

	// Player Stats.

	public static int playerConstitution;
	public static int playerDexterity;
	public static int playerStrength;
	public static int playerWisdom;
	public static int playerIntelligence;

	// Specialized Stats.

	public static int playerHealth = 100 + (playerConstitution * 3);
	public static int playerDamage = 40 + (playerStrength * 2);
	public static int playerArmor = 20 + (int)(playerConstitution / 2);

	public Player(String name, String species) {
		playerName = name;
		playerDragon = species;
		playerExp = 0;
	}



}
