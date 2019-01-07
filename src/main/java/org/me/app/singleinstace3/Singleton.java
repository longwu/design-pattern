package org.me.app.singleinstace3;

/**
 * 单元素的枚举类型已经成为实现Singleton的最佳方法
 * 
 * 使用枚举来实现单实例控制会更加简洁，而且无偿地提供了序列化机制，
 * 并由JVM从根本上提供保障，绝对防止多次实例化，是更简洁、高效、安全的实现单例的方式。
 * 
 * @author JasonWu
 *
 */
public enum Singleton {
	
	//定义一个枚举元素,它代表了Singleton的一个实例
    instance;
	
	//单例方法
	public void doSomeThing(){
		System.out.println("doSomeThing");
	}
	
}
