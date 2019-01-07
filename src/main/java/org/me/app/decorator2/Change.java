package org.me.app.decorator2;

public class Change implements TheGreatSage {

	private TheGreatSage sage;
	
	/**
	 * 传入接口实现类中的move方法
	 * @param sage
	 */
	public Change(TheGreatSage sage) {
		this.sage = sage;
	}

	public void move() {
		this.sage.move();//调用接口实现类中的move方法
	}
}
