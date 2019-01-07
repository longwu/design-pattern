package org.me.app.decorator2;

public class Client {

	public static void main(String[] args) {
		TheGreatSage sage = new Monkey();
		sage.move();

		TheGreatSage bird = new Bird(sage);
		bird.move();

		TheGreatSage fish = new Fish(sage);
		fish.move();
	}
}
