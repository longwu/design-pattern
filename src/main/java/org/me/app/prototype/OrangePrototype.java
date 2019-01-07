package org.me.app.prototype;

/**
 * OrangePrototype包含一个拷贝自己的方法
 * @author JasonWu
 *
 */
public class OrangePrototype implements Prototype {
   
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Prototype clone() {
		return new OrangePrototype();
	}
}
