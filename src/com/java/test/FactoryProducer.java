package com.java.test;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory){
		if(factory.equals("ShapeFactory"))
			return new ShapeFactory();
		else if(factory.equals("ColorFactory"))
			return new ColorFactory();
		else
			return null;
	}
}