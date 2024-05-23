package project3;

import java.util.Scanner;

import project3.characters.Knight;
import project3.characters.Monster;
import project3.characters.Berserker;
import project3.characters.Rouge;

public class Main {

	public static void main(String[] args) {
		// Creates initial variables and ask for user input
		int res = 0;
		boolean game = true;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Select your class: \n1. Knight\n2. Berserker\n3. Rouge\n");
		try {
			res = scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Creates monster entity
		Monster enemy = new Monster();
		
		// Creates player entity based off response
		if (res == 1) {
			Knight player = new Knight();
			System.out.println("You picked the knight.");
		} else if (res == 2) {
			Berserker player = new Berserker();
			System.out.println("You picked the berserker.");
		} else {
			Rouge player = new Rouge();
			System.out.println("You picked the rouge.");
		}
		
		
		
			
	}

}
