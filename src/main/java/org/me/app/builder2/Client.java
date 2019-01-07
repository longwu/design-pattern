package org.me.app.builder2;

public class Client {

	public static void main(String[] args) {
		Builder builder = null;

		//builder = new WelcomeBuilder();
		
		builder = new GoodbyeBuilder();
		
		Director director = new Director(builder);
		director.constract();
	}
}
