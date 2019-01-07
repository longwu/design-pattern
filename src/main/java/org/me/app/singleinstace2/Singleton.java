package org.me.app.singleinstace2;

public class Singleton {

	private Singleton() {
		System.out.println("private Singleton(){}");
	}

	/**
	 * 类级内部类,静态的内部类成员,该内部类与外部类的实例没有绑定关系, 只有被调用的时候才会加载,实现了延迟加载
	 * 
	 * @author JasonWu
	 *
	 */
	private static class SingletonHolder {

		// 与外部的Singleton没有绑定关系,在外部类Singleton加载的时候不会被实例化
		// 静态初始化器，由JVM来保证线程安全
		private static Singleton instance = new Singleton();
	}

	/**
	 * 只有在调用的时候才会实例化Singleton
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}

	public void doSomeThing() {
		System.out.println("hello");
	}
}
