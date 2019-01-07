package org.me.app.prototype;

public class User {
	private Prototype prototype;

	public User(Prototype prototype) {
		this.prototype = prototype;
	}

	public void operation() {
		this.prototype = this.prototype.clone();
		
		//System.out.println(this.prototype.getName());
		System.out.println(this.prototype.toString());
	}
}
