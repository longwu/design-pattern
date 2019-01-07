package org.me.app.decorator2;

public class Bird extends Change {

	public Bird(TheGreatSage sage) {
		super(sage);
	}

	public void move() {
		System.out.println("我变成了鸟,可以飞");
	}
}
