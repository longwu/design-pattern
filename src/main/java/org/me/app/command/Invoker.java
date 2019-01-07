package org.me.app.command;

public class Invoker {
   private Command command;
   
   public Invoker(Command command) {
	   this.command = command;
   }
   
   public void action() {
	   System.out.println("Invoker 消息发出");
	   this.command.execute();
   }
}
