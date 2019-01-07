package org.me.app.decorator;

/**
 * 具体装饰角色A 负责给构件对象“贴上”附加的责任。
 * 
 * 比如给汽车增加一个水上跑的功能
 * @author JasonWu
 *
 */
public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	public void sampleOperation() {
		super.sampleOperation();
		System.out.println("ConcreteDecoratorA.sampleOperation():汽车能在水上跑");
	}
}
