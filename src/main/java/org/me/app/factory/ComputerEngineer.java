package org.me.app.factory;

public class ComputerEngineer {

	public void makeComputer() {
		//准备好配件
		prepareHardwares(CpuType.AMD, MainboardType.AMD, HardDiskType.AMD);
		
		//组装机器
		
		//测试机器
	}
	
	private void prepareHardwares(CpuType cpuType, MainboardType mainboardType,HardDiskType hardDiskType) {
		
		Cpu cpu = CpuFactory.create(cpuType);
		cpu.calculate();
		
		Mainboard mainboard = MainboardFactory.create(mainboardType);
		mainboard.installCPU();
		
		HardDisk hardDisk = HardDiskFactory.createHardDisk(hardDiskType);
		hardDisk.save();
	}
}
