package org.me.app.builder2;

public class GoodbyeBuilder extends Builder {

	public GoodbyeBuilder() {
		this.msg = new GoodbyeMessage();
	}

	@Override
	public void buildSubject() {
		this.msg.setSubject("再见标题");
	}

	@Override
	public void buildBody() {
		this.msg.setBody("再见内容");
	}
}
