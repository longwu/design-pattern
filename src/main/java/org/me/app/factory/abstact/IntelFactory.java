package org.me.app.factory.abstact;

public class IntelFactory implements AbstractFactory {

	public Cpu createCpu() {
		return new IntelCpu(200);
	}

	public Mainboard createMainboard() {
		return new IntelMainboard(200);
	}

	public HardDisk createHardDisk() {
		return new IntelHardDisk(80);
	}
}
