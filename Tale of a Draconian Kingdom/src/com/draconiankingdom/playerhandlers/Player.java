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
	
	public void showPlayerStats() {
		System.out.println("\n # " + playerName + "'s" + " Statistics " + " #");
		System.out.println("\n   Constitution: " + playerConstitution);
		System.out.println("   Dexterity: " + playerDexterity);
		System.out.println("   Strength: " + playerStrength);
		System.out.println("   Wisdom: " + playerWisdom);
		System.out.println("   Intelligence: " + playerIntelligence);
		
		System.out.println("\n   Player Health: " + playerHealth);
		System.out.println("   Player Level: " + PlayerLevelHandler.playerLevel);
	}
	
	// Player Effects
	
	public void modifyPlayerHealth(int health) {
		playerHealth += health;
	}

	public void modifyPlayerConstitution(int CONT) {
		playerConstitution += CONT;
	}

	public void modifyPlayerDexterity(int DEX) {
		playerDexterity += DEX;
	}

	public void modifyPlayerStrength(int STR) {
		playerStrength += STR;
	}

	public void modifyPlayerWisdom(int WIS) {
		playerWisdom += WIS;
	}

	public void modifyPlayerIntelligence(int INT) {
		playerIntelligence += INT;
	}




}
