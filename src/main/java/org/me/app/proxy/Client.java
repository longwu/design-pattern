package org.me.app.proxy;

public class Client {

	public static void main(String[] args) {
		//AbstractObject 不能直接实例化 调用operation方法
		AbstractObject object = new ProxyObject();
        object.operation();
	}
}
