package com.draconiankingdom.playerhandlers;

/**
 * This class handles basic character creation by making stat templates for the
 * player's choice of dragon 'breed'.
 * 
 * Future Plans: Add specific dragon subclasses for each template to outline
 * unique abilities.
 * 
 * @author Zaezul
 *
 */

public class Dragon extends Player {

	public Dragon(String name, String species) {
		super(name, species);
	}

	// Red Dragon Player Template

	public static void createRedDragon() {
		Player.playerConstitution = 30;
		Player.playerDexterity = 20;
		Player.playerStrength = 35;
		Player.playerWisdom = 15;
		Player.playerIntelligence = 25;
		
		Player.playerDragon = "Red Dragon";
	}

	// Green Dragon Player Template

	public static void createGreenDragon() {
		Player.playerConstitution = 25;
		Player.playerDexterity = 30;
		Player.playerStrength = 25;
		Player.playerWisdom = 20;
		Player.playerIntelligence = 25;
		
		Player.playerDragon = "Green Dragon";
	}

	// Blue Dragon Player Template

	public static void createBlueDragon() {
		Player.playerConstitution = 25;
		Player.playerDexterity = 15;
		Player.playerStrength = 30;
		Player.playerWisdom = 25;
		Player.playerIntelligence = 30;
		
		Player.playerDragon = "Blue Dragon";
	}

	// White Dragon Player Template

	public static void createWhiteDragon() {
		Player.playerConstitution = 20;
		Player.playerDexterity = 20;
		Player.playerStrength = 20;
		Player.playerWisdom = 25;
		Player.playerIntelligence = 40;
		
		Player.playerDragon = "White Dragon";
	}

	// Black Dragon Player Template

	public static void createBlackDragon() {
		Player.playerConstitution = 25;
		Player.playerDexterity = 20;
		Player.playerStrength = 30;
		Player.playerWisdom = 20;
		Player.playerIntelligence = 30;
		
		Player.playerDragon = "Black Dragon";
	}

}
