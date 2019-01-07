package org.me.app.adapter2;

public class Client {

	/**
	 * 对象适配器模式 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());//Adapter适配器跟Adaptee适配源有关系
		target.sampleOperation1();
		target.sampleOperation2();
	}
}
