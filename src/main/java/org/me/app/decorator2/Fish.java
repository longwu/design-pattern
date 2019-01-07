package org.me.app.decorator2;

public class Fish extends Change {

	public Fish(TheGreatSage sage) {
		super(sage);
	}

	public void move() {
		System.out.println("我变成了鱼,可以游泳");
	}
}
