package com.sid.CommandDesignPattern;

public class TVRemote {
	
	public static ElectronicDevice getDevice(){
		
		return new Television();
		
	}
	
}