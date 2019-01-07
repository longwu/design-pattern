package org.me.app.command;

public class Client {

	public static void main(String[] args) {

		Command command = new ConcreteCommand(new Receiver());//命令与接受人绑定
		
		Invoker invoker = new Invoker(command);//发送者需要使用具体的命令

		invoker.action();//给接口人发送请求
	}
}
