package org.me.app.decorator;

/**
 * 装饰角色,实现了抽象构件接口
 * @author JasonWu
 *
 */
public class Decorator implements Component {

	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	public void sampleOperation() {
		this.component.sampleOperation();
	}
}
