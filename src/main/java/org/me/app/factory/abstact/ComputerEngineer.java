package org.me.app.factory.abstact;

public class ComputerEngineer {

	/**
	 * 传入具体的工厂,自动组装该工厂里的机器
	 * @param factory
	 */
	public void makeComputer(AbstractFactory factory) {
		//准备好配件
		prepareHardwares(factory);
		
		//组装机器
		
		//测试机器
	}
	
	private void prepareHardwares(AbstractFactory factory) {
		
		Cpu cpu = factory.createCpu();
		cpu.calculate();
		
		Mainboard mainboard = factory.createMainboard();
		mainboard.installCPU();
		
		HardDisk hardDisk = factory.createHardDisk();
		hardDisk.save();
	}
}
