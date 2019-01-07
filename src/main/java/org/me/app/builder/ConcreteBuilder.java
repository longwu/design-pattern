package org.me.app.builder;

public class ConcreteBuilder implements Builder {

	private Product product = new Product();

	public void buildPart1() {
		product.setPart1("编号:89757");
	}

	public void buildPart2() {
		product.setPart2("名称:机器人Mike");
	}
	
	public void buildPart3() {
		product.setPart3("电量:10小时");
	}
	
	public Product getProduct() {
		return this.product;
	}
}
