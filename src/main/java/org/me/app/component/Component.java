package org.me.app.component;

public abstract class Component {

	/**
	 * 虽然抽象类不能实例化,但内部的属性可以被其实例化的对象使用
	 */
	String name;

	public void SayHello() {
		System.out.println("大家好,我来自抽象类");
	}

	public abstract void add(Component c);

	public abstract void remove(Component c);

	public abstract void eachChild();
}
