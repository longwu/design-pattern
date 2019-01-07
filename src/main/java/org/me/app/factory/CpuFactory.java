package org.me.app.factory;

public class CpuFactory {

	/**
	 * 制造CPU
	 * @param type
	 * @param pins
	 * @return
	 */
	public static Cpu create(CpuType type) {
		Cpu cpu = null;
		switch (type) {	
		case INTEL:
			cpu = new IntelCpu(100);
			break;
		case AMD:
			cpu = new AmdCpu(150);
			break;
		}
		return cpu;
	}
}
