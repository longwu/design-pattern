package org.me.app.builder;

public class Client {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();

		Director director = new Director(builder);//给导演一个builder
		director.construct();//导演调用builder来构建产品,至于builder如何构建产品导演不关心

		Product product = builder.getProduct();//构建完成后,调用buider的getProduct方法返回构建好的产品

		//输出创建好的产品各参数
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
		System.out.println(product.getPart3());
	}
}
