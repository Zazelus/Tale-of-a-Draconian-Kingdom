package com.draconiankingdom.playerhandlers;
/**
 * Any stat changes that happen to the character will be handled in this class.
 * This may happen through events, through combat, gaining items or losing them
 * and other various cases.
 * 
 * @author Zaezul
 *
 */

public class PlayerEffects extends Player {

	public PlayerEffects(String name, String species) {
		super(name, species);
	}

	public void playerHealth(int health) {
		playerHealth += health;
	}

	public void playerConstitution(int CONT) {
		playerConstitution += CONT;
	}

	public void playerDexterity(int DEX) {
		playerDexterity += DEX;
	}

	public void playerStrength(int STR) {
		playerStrength += STR;
	}

	public void playerWisdom(int WIS) {
		playerWisdom += WIS;
	}

	public void playerIntelligence(int INT) {
		playerIntelligence += INT;
	}

}