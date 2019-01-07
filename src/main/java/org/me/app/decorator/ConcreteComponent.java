package org.me.app.decorator;

/**
 * 具体构件(ConcreteComponent)角色：定义一个将要接收附加责任的类。
 * 
 * @author JasonWu
 *
 */
public class ConcreteComponent implements Component {

	public void sampleOperation() {
		System.out.println("ConcreteComponent.sampleOperation():汽车能在陆上跑");
	}
}
