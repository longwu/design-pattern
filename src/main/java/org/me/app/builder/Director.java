package org.me.app.builder;

public class Director {

	private Builder builder = null;

	public Director(Builder builder) {
		this.builder = builder;
	}

	/**
	 * 导演利用builder将各个模块做好,导演本身不关心如何创建产品模块
	 */
	public void construct() {
		this.builder.buildPart1();
		this.builder.buildPart2();
		this.builder.buildPart3();
	}
}
