package org.me.app.facade2;

public class Client {

	/**
	 * 通过合理使用Facade，可以帮助我们更好地划分访问的层次。
	 * 有些方法是对系统外的，有些方法是系统内部使用的。
	 * 把需要暴露给外部的功能集中到门面中，这样既方便客户端使用，也很好地隐藏了内部的细节。
	 * @param args
	 */
	public static void main(String[] args) {
		ModuleFacade facade = new ModuleFacade();
		facade.a1();
		facade.b1();
		facade.c1();
	}
}
