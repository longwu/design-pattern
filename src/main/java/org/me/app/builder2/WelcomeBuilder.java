package org.me.app.builder2;

public class WelcomeBuilder extends Builder {

	public WelcomeBuilder() {
		this.msg = new WelcomeMessage();
	}

	/**
	 * 重写基类buildSubject抽象方法
	 */
	@Override
	public void buildSubject() {
		this.msg.setSubject("欢迎标题");
	}

	/**
	 * 重写基类buildBody抽象方法
	 */
	@Override
	public void buildBody() {
		this.msg.setBody("欢迎内容");
	}
}
