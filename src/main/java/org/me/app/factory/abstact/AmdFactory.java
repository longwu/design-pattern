package org.me.app.factory.abstact;

public class AmdFactory implements AbstractFactory {

	public Cpu createCpu() {
		return new AmdCpu(100);
	}

	public Mainboard createMainboard() {
		return new AmdMainboard(100);
	}

	public HardDisk createHardDisk() {
		return new AmdHardDisk(50);
	}
}
