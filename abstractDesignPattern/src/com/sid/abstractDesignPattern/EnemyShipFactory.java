package com.sid.abstractDesignPattern;

//With an Abstract Factory Pattern you won't
//just build ships, but also all of the components
//for the ships

//Here is where you define the parts that are required
//if an object wants to be an enemy ship

public interface EnemyShipFactory {

	public EnemyShip makeEnemyShip(EnemyShip newShipType)
	{
		EnemyShip newShip = null;
		
		if (newShipType.equals("U")) {
			
			return new UFOEnemyShip();
		}else
			
	if (newShipType.equals("R")) {
				
				return new RocketEnemyShip();
			}else
				
	if (newShipType.equals("B")) {
		
		return new BigEnemyShip();
	}
	else
	return null;
		
	}

}
