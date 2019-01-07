package org.me.app.flyweight;

public class Client {

	/**
	 * String类型就是使用了享元模式。String对象是final类型， 对象一旦创建就不可改变。在JAVA中字符串常量都是存在常量池中的，
	 * JAVA会确保一个字符串常量在常量池中只有一个拷贝。 String a="abc"，其中"abc"就是一个字符串常量。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";

		// 结果为：true
		// ，这就说明a和b两个引用都指向了常量池中的同一个字符串常量"abc"。这样的设计避免了在创建N多相同对象时所产生的不必要的大量的资源消耗。
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}
