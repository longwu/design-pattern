package org.me.app.builder2;

import java.util.Date;

public class Director {

	private Builder builder = null;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void constract() {
		this.builder.buildSubject();
		this.builder.buildBody();
		this.builder.buildFrom("mike@123.com");
		this.builder.buildTo("steve@123.com");
		this.builder.buildSendDate(new Date());
		this.builder.sendMessage();
	}
}
