package org.me.app.decorator;

/**
 * 具体装饰B, 给汽车增加一个飞行的功能
 * @author JasonWu
 *
 */
public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	
	public void sampleOperation() {
		super.sampleOperation();
		System.out.println("ConcreteDecoratorB.sampleOperation():汽车能在天上飞");
	}
}
