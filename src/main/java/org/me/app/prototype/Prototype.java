package org.me.app.prototype;

/**
 * 提供一个可以克隆自己的接口
 * 
 * @author JasonWu
 *
 */
public interface Prototype {
	String name = "";
	
	void setName(String name);

	String getName();

	Prototype clone();
}
