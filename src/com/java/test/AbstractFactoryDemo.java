package com.java.test;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractFactory factory=FactoryProducer.getFactory("ShapeFactory");
		Shape shape=factory.getShape("Circle");
		shape.draw();

		factory=FactoryProducer.getFactory("ColorFactory");
		Color color=factory.getColor("Black");
		color.fill();
	}
}