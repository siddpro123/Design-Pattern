package com.sid.abstractDesignPattern;

public abstract class EnemyShip {
	
	private String name;
	
	private double speed;
	
	private double damage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	// Newly defined objects that represent weapon & engine
	// These can be changed easily by assigning new parts 
	// in UFOEnemyShipFactory or UFOBossEnemyShipFactory
	
	
	
}