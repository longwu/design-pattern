package org.me.app.proxy;

/**
 * 目标对象角色：定义了代理对象所代表的目标对象。
 * 
 * @author JasonWu
 *
 */
public class RealObject extends AbstractObject {

	@Override
	public void operation() {
        System.out.println("from RealObject.operation()");
	}
}
