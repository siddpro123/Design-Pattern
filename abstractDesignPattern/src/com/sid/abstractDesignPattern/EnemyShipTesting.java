package com.sid.abstractDesignPattern;

import java.util.Scanner;

public class EnemyShipTesting  {
	
public static void main(String[] args) {
		
	//creates the factory object 
	EnemyShipFactory shipFactory = new EnemyShipFactory(); 
	
	//Enemy ship object
	
	makeEnemyShip theEnemy = null;
	
	Scanner userInput = new Scanner (System.in);
	System.out.println("what type of ship? ( U/R/B)");
	
	if ( userInput.hasNextLine()) {
		String typeOfShip = userInput.nextLine();
		
		theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		
		if ( theEnemy != null) {
			makeEnemyShip(theEnemy);
		}
		else
			System.out.println("please enter wise choice next time");
	}
}

