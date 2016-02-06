package com.java.test;

public class ShapeFactory extends AbstractFactory {

	public Shape getShape(String shape){
		if(shape.equals("Circle"))
			return new Circle();
		else if(shape.equals("Square"))
			return new Square();
		else
			return null;
	}
	public Color getColor(String color){
		return null;
	}
}