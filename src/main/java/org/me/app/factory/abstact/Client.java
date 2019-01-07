package org.me.app.factory.abstact;

public class Client {

	public static void main(String[] args) {
		//创建工程师对象
		ComputerEngineer engineer = new ComputerEngineer();
		
		//让客户选择要使用的产品,比如intel的
		AbstractFactory factory = new IntelFactory();
		//让工程师创建intel产品
		engineer.makeComputer(factory);
		
		//客户选择amd的
		factory = new AmdFactory();
		//工程师创建amd的产品
		engineer.makeComputer(new AmdFactory());
	}
}
