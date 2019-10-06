package com.draconiankingdom.main;

import com.draconiankingdom.playerhandlers.Dragon;
import com.draconiankingdom.prompters.Prompter;

public class Assembler {
	
	private static Prompter prompter = new Prompter();
	
	public static Dragon playerDragon;
	public static String playerName;
	public static String playerSpecies;

	public static void main(String[] args) {
		prompter.gameStart();
	}
	
}