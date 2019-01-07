package org.me.app.singleinstace;

/**
 * 懒汉式单例
 * 
 * 类加载的时候不实例化,只有在单例被调用的时候才实例化
 *
 * 懒汉式是典型的时间换空间,就是每次获取实例都会进行判断，看是否需要创建实例，浪费判断的时间。当然，如果一直没有人使用的话，那就不会创建实例，则节约内存空间
 *
 * 由于懒汉式的实现是线程安全的，这样会降低整个访问的速度
 *
 * @author JasonWu
 *
 */
public class LazySingleton {

	// 类加载的时候并没有实例化
	private static LazySingleton instance = null;

	// 无法被外部实例化
	private LazySingleton() {

	}

	/**
	 * 
	 * 只有在调用的时候才实例化
	 * 
	 * 使用synchronized关键字进行同步化,以处理多线程环境
	 * 
	 * 由于懒汉式的实现是线程安全的，这样会降低整个访问的速度，而且每次都要判断
	 */
	public static synchronized LazySingleton getInstance() {//每次调用的时候都进行同步化
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
