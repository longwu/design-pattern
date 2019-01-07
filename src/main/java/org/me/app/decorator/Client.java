package org.me.app.decorator;

public class Client {

	public static void main(String[] args) {

		// 汽车原有功能路上跑
		Decorator car = new Decorator(new ConcreteComponent());

		// 给汽车增加功能A
		car = new ConcreteDecoratorA(car);

		// 给汽车增加功能B
		car = new ConcreteDecoratorB(car);
		
		car.sampleOperation();
	}
}
