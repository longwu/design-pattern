package org.me.app.command;

public class ConcreteCommand implements Command {
    
	//持有接收者对象
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	/**
	 * 通常会转调接收者对象的相应方法，让接收者来真正执行功能
	 */
	public void execute() {
          receiver.action();
	}
}
