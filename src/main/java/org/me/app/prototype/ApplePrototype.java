package org.me.app.prototype;

/**
 * AppleProtype 包含一个克隆自己的方法
 * 
 * @author JasonWu
 *
 */
public class ApplePrototype implements Prototype {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Prototype clone() {
		return new ApplePrototype();
	}
}
