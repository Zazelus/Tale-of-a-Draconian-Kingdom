package com.draconiankingdom.prompters;

import java.util.Scanner;

import com.draconiankingdom.main.Assembler;
import com.draconiankingdom.playerhandlers.Dragon;

public class Prompter {
	
	public static Scanner console = new Scanner(System.in);
	
	public Prompter() {
		
	}
	
	public void gameStart() {
		
		System.out.println("# Welcome to the Tale of a Draconian Kingdom #");
		
		System.out.println("\n  Long ago, dragons used to rule this fledgling world and with your birth, they shall again.");
		System.out.println("  How this is done, however, is up to... ");
		
		System.out.println("\n  Now, young drake lord. Which one of your glorious kind most suits you?");
		System.out.println("\n  1. The Red Dragon: Masters of destruction, usually tyrants and rule by fear.");
		System.out.println("  2. The Green Dragon: Masters of none, they rule their subjects through varying means.");
		System.out.println("  3. The Blue Dragon: Masters of caution, they are diplomatic and favor security.");
		System.out.println("  4. The White Dragon: Masters of magic, they rely on magic to defend themselves and their subjects.");
		System.out.println("  5. The Black Dragon: Masters of illusion, they rule by fear.");
		
		int intInput = console.nextInt();
		
		System.out.println("  What is your name?");
		String strInput = console.next();
		
		if (intInput == 1) {
			Assembler.playerSpecies = "Red Dragon";
		} else if (intInput == 2) {
			Assembler.playerSpecies = "Green Dragon";
		} else if (intInput == 3) {
			Assembler.playerSpecies = "Blue Dragon";
		} else if (intInput == 4) {
			Assembler.playerSpecies = "White Dragon";
		} else if (intInput == 5) {
			Assembler.playerSpecies = "Black Dragon";
		}
		
		Assembler.playerName = strInput;
		Assembler.playerDragon = new Dragon(Assembler.playerName, Assembler.playerSpecies);
		
		System.out.println("  You are a " + Assembler.playerSpecies + " and your name is " + Assembler.playerName + ".");
		
	}

}
