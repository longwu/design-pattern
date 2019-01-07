package org.me.app.facade2;

public class ModuleFacade {
	/**
	 * 下面这些是A、B、C模块对子系统外部提供的方法
	 */
	public void a1() {
		ModuleA a = new ModuleA();
		a.a1();
		System.out.println("调用ModuleA.a1()方法");
	}

	public void b1() {
		ModuleB b = new ModuleB();
		b.b1();
		System.out.println("调用ModuleB.b1()方法");
	}

	public void c1() {
		ModuleC c = new ModuleC();
		c.c1();
		System.out.println("调用ModuleC.c1()方法");
	}
}
