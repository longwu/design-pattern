package org.me.app.prototype;

public class Client {
	public static void main(String[] args) {

		Prototype prototype = new ApplePrototype();
		User user = new User(prototype);
		user.operation();
		
		prototype = new OrangePrototype();
		user = new User(prototype);
		user.operation();
	}
}
