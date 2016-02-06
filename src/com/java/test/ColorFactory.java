package com.java.test;

public class ColorFactory extends AbstractFactory{
	public Shape getShape(String shape){
		return null;
	}
	
	public Color getColor(String color){
		if(color.equals("Red"))
			return new Red();
		else if(color.equals("Black"))
			return new Black();
		else
			return null;
	}
}