package org.me.app.prototype2;

public class ConcretePrototype1 implements Prototype {

	private String name;

	public Prototype clone() {
		ConcretePrototype1 prototype1 = new ConcretePrototype1();
		prototype1.setName(this.name);
		return prototype1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		 return "Now in Prototype1 , name = " + this.name;
	}
}
