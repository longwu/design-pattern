package org.me.app.builder3;

import org.me.app.builder3.InsuranceContract;

public class Client {

	public static void main(String[] args) {
		// 创建构造器对象
		InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("89757", 1111, 2222);

		//报异常,因为公司名称和个人名称不能一起设置
		//InsuranceContract contact = builder.setCompanyName("company").setPersonName("mike").setOtherData("other").build();
		
		InsuranceContract contact = builder.setCompanyName("company").setOtherData("other").build();

		contact.someOperation();
	}
}
