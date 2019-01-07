package org.me.app.factory.abstact;

/**
 * 抽象工厂接口,包含cpu和主板创建方法
 * @author JasonWu
 *
 */
public interface AbstractFactory {
	public Cpu createCpu();
	public Mainboard createMainboard();
	public HardDisk createHardDisk();
}
