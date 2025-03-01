package com.draconiankingdom.prompters;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.draconiankingdom.main.Assembler;
import com.draconiankingdom.playerhandlers.Dragon;
import com.draconiankingdom.playerhandlers.Player;
import com.dragonciankingdom.enemies.ArtBuilder;

public class Prompter {
	
	public static Scanner console = new Scanner(System.in);
	ArtBuilder builder = new ArtBuilder();	
	
	public Prompter() {
		
	}
	
	public static void printWithDelays(String data, long delay)
	        throws InterruptedException {
	    for (char ch:data.toCharArray()) {
	        System.out.print("\n" + ch + "\n");
	        TimeUnit.MILLISECONDS.sleep(delay);
	    }
	}
	
	public void gameStart() throws InterruptedException {
		
		System.out.println("!######################################################################################################################################!\n");
		builder.printDragon();
		
		System.out.println("# Welcome to the Tale of a Draconian Kingdom #");
		
		System.out.println("\n  Long ago, dragons used to rule this fledgling world and with your birth, they shall again.");
		System.out.println("  How this is done, however, is up to... ");
		
		System.out.println("\n!######################################################################################################################################!");
		
		printWithDelays(".....", 1000);
		
		System.out.println("\n  Now, young drake lord. Which one of your glorious kind most suits you?");
		System.out.println("\n  1. The Red Dragon: Masters of destruction, usually tyrants and rule by fear.");
		System.out.println("  2. The Green Dragon: Masters of none, they rule their subjects through varying means.");
		System.out.println("  3. The Blue Dragon: Masters of caution, they are diplomatic and favor security.");
		System.out.println("  4. The White Dragon: Masters of magic, they rely on magic to defend themselves and their subjects.");
		System.out.println("  5. The Black Dragon: Masters of illusion, they rule by fear.");
		
		int intInput = console.nextInt();
		
		if (intInput == 1) {
			Assembler.playerSpecies = "Red Dragon";
			Dragon.createRedDragon();
		} else if (intInput == 2) {
			Assembler.playerSpecies = "Green Dragon";
			Dragon.createGreenDragon();
		} else if (intInput == 3) {
			Assembler.playerSpecies = "Blue Dragon";
			Dragon.createBlueDragon();
		} else if (intInput == 4) {
			Assembler.playerSpecies = "White Dragon";
			Dragon.createWhiteDragon()
;		} else if (intInput == 5) {
			Assembler.playerSpecies = "Black Dragon";
			Dragon.createBlackDragon();
		}
		
		System.out.println("\n!######################################################################################################################################!");
		
		System.out.println("\n  How did you live your life in your fledgling years before drakehood? ");
		System.out.println("\n  1. I was an obedient wyrmling and spent most of my fledgling days under instruction by an elder near our territory.");
		System.out.println("  2. I took every opportunity that I could to miss my lessons and instead explored the forests nearby.");
		System.out.println("  3. Training my body was my priority and I spent most of my waking moments sparring with siblings and the others near my family's territory.");
		System.out.println("  4. My egg was bought by an elven mage, and when I hatched I learned as much as I could about the magical arts in secret, before making my escape when I came of age.");
		System.out.println("  5. As a wyrmling, I was abondoned by my parents and I learned how to survive in the untamed wilds, fighting off ferocious beasts and bands of orcs and goblins.");
		
		intInput = console.nextInt();
		
		if (intInput == 1) {
			Assembler.playerDragon.modifyPlayerWisdom(5);
		} else if (intInput == 2) {
			Assembler.playerDragon.modifyPlayerDexterity(5);
		} else if (intInput == 3) {
			Assembler.playerDragon.modifyPlayerStrength(5);
		} else if (intInput == 4) {
			Assembler.playerDragon.modifyPlayerIntelligence(5);
		} else if (intInput == 5) {
			Assembler.playerDragon.modifyPlayerConstitution(5);
		}
		
		System.out.println("\n!######################################################################################################################################!");

		System.out.println("\n  What is your name?");
		String strInput = console.next();
		
		Assembler.playerName = strInput;
		Assembler.playerDragon = new Dragon(Assembler.playerName, Assembler.playerSpecies);
		
		System.out.println("\n  You are a young and magnifcient " + Assembler.playerSpecies + " and your name is " + Assembler.playerName + ".");
		System.out.println("\n!######################################################################################################################################!");

		printWithDelays(".....", 1000);
		
		Assembler.playerDragon.showPlayerStats();
		TimeUnit.MILLISECONDS.sleep(10000);
		
		System.out.println("\n!######################################################################################################################################!");
		
		System.out.println("\n  The listing above displays various statistics that will be essential throughout your journey. The consequences of various interactions will be decided by one or more specific characteristics.");
		System.out.println("\n  Constitution has a direct effect on how much health you will have, and will allow you to suffer more damage before dying in combat encounters. It may also be used for different dialogue choices.");
		System.out.println("  Dexterity is a measure of agility and with your intelligence, how cunning you are.");
		System.out.println("  Strength dictates how much damage you deal to enemies and can provide a bonus to intimidation in dialogue.");
		System.out.println("  Wisdom allows you to resist negative status effects and is also used in dialogue to pass checks that require a level of disdain or foresight.");
		System.out.println("  Intelligence helps in casting spells, researching new technology and in passing other varying dialogue interactions.");
		
		System.out.println("\n  Depending on the encounters you may face, you will gain a certain level of experience which effects your level. You can decide on new abilities to learn and which statistics you want to upgrade every level.");
		
		TimeUnit.MILLISECONDS.sleep(10000);
		System.out.println("\n!######################################################################################################################################!");
		
		System.out.println("\n  Now, " + Player.playerName + " most dragon families will oust their young once they've reached an appropriate age so that they may experience the world for themselves. \n  Yours was such a family. After leaving your family's territory, where did you end up?");
		System.out.println("\n  1. The Plains of Avalar: A lush, green valley filled with opportunity. Although unassuming, it would be wise to procede with caution.");
		System.out.println("  2. The Enchanted Forest: A massive region dense with ancient oaks. Its very air is teeming with magical energies. Many unsuspecting dragons have met their end here, however mighty.");
		System.out.println("  3. The Swamps of Zalfel: A murky, desolate and hostile place. It was created by the foul magics of the ancient arch mage Zalfel in his quest for dominance a millenia ago.");
		
		System.out.println("\n!######################################################################################################################################!");
		
		/*System.out.println("\n  1. The Humans: Tenacious and highly adapting creatures, they use technology and innovation to overcome their weaknesses. They have an innate fear and awe of dragons.");
		System.out.println("  2. The Orcs and Goblins: Collectively referred to as 'Greenskins', they are usually crude and violent when interacting with others or those of their own kind. They respect the strong and tread upon the weak.");
		System.out.println("  3. The Elves: Forest dwelling folk, they spend most of their long lives practicing magic and creating works of art, they are slow to action and tend to take the diplomatic route. They are curious about your kind, and have the most experience interacting with dragons.");*/
		
		intInput = console.nextInt();
		
		if (intInput == 1) {
			humanStart();
		} else if (intInput == 2) {
			greenStart();
		} else if (intInput == 3) {
			elfStart();
		}
			
	}
	
	public void humanStart() {
		
		System.out.println("\n  Avalar... Home of the humans. Tenacious and highly adapting creatures, they use technology and innovation to overcome their weaknesses. They have an innate fear and awe of dragons, despite this they are not to be underestimated.");
		System.out.println("\n!######################################################################################################################################!");

	}
	
	public void greenStart() {
		
		System.out.println("\n  The Enchanted Forest... Home of the elves. Mainly forest dwelling creatures, they are fickle beings and spend most of their long lives practicing magic and creating works of art.\n  They are slow to action and tend to take diplomatic action as opposed to direct conflict. They are curious about your kind, and have the most experience interacting with dragons.");
		System.out.println("\n!######################################################################################################################################!");
		
	}
	
	public void elfStart() {
		
		System.out.println("\n  Zalfel... Home of several orc and goblin tribes. Collectively referred to as 'Greenskins', they are usually crude and violent when interacting with others or those of their own kind. They respect the strong and tread upon the weak. Naturally, they choose to worship many draconic figures as deities of destruction.");
		System.out.println("\n!######################################################################################################################################!");
		
	}

}
