package org.me.app.singleinstace;

/**
 * 饿汉式单例,类在被系统加载的时候就被实例化了,实际单例还没有被调用.
 * 
 * 饿汉式是典型的空间换时间，当类装载的时候就会创建类的实例，不管你用不用，先创建出来，然后每次调用的时候，就不需要再判断，节省了运行时间。
 * 
 * @author JasonWu
 *
 */
public class EagerSingleton {
    //在类被加载的情况下,就会被实例化,此时程序中单例还没有被调用
	private static EagerSingleton instance = new EagerSingleton();
	
	/**
	 * 私有化构造函数,使得EagerSingleton无法被外界实例化
	 */
	private EagerSingleton(){
		
	}
	
	/**
	 * 获取单例
	 * @return
	 */
	public static EagerSingleton getInstance(){
		return instance;
	}
}
