package org.me.app.singleinstace;


/**
 * 双重检查加锁 使得单例线程安全且性能高
 * 
 * @author JasonWu
 *
 */
public class Singleton {

	//关键字volatile，它的意思是：被volatile修饰的变量的值，将不会被本地线程缓存，
	//所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
	
	//由于volatile关键字可能会屏蔽掉虚拟机中一些必要的代码优化，
	//所以运行效率并不是很高。因此一般建议，没有特别的需要，不要使用。
	//也就是说，虽然可以使用“双重检查加锁”机制来实现线程安全的单例，但并不建议大量采用，可以根据情况来选用。
	private volatile static Singleton instance = null;

	private Singleton() {

	}

	/**
	 * 双重检查以及加锁,提升多线程安全下的性能
	 * 
	 * 注意：在java1.4及以前版本中，很多JVM对于volatile关键字的实现的问题，
	 * 会导致“双重检查加锁”的失败，因此“双重检查加锁”机制只只能用在java5及以上的版本。
	 * 
	 * @return
	 */
	public static Singleton getInstance() {//每次调用的时候先不进行同步化
        //首先判断单例是否为空
		if (instance == null) {
            //如果为空,再进行同步化
			synchronized (Singleton.class) {//使用synchronized 进行加锁
                //再次判断同步化后的单例是否为空.如果还为空,则实例化
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
