package org.me.app.prototype2;

public class Client {

	public static void main(String[] args) {
	  
		Prototype p1 = new ConcretePrototype1();
		PrototypeManager.setPrototype("p1", p1);
		
		Prototype p3 = PrototypeManager.getPrototype("p1").clone();//创建一个新的p1对象
		p3.setName("张三");
		
		System.out.println("第一个实例:" + p3);
		
		
		Prototype p2 = new ConcretePrototype2();
		PrototypeManager.setPrototype("p1", p2); //创建一个新的p2 并床给p1
		
		Prototype p4 = PrototypeManager.getPrototype("p1").clone();
		p4.setName("李四");
		System.out.println("第二个实例:" + p4);
		
		
		 //有人注销了这个原型
        PrototypeManager.removePrototype("p1");
        //再次获取原型来创建对象
        Prototype p5 = PrototypeManager.getPrototype("p1").clone();//p1被移除了,报空指针异常
        p5.setName("王五");
        System.out.println("第三个实例：" + p5);
	}
}
