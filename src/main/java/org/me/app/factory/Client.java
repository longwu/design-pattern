package org.me.app.factory;

public class Client {

	public static void main(String[] args) {
		
//		Cpu cpu = CpuFactory.create(CpuType.INTEL, 100);
//		cpu.calculate();
//		
//		cpu = CpuFactory.create(CpuType.AMD, 200);
//		cpu.calculate();
		
		ComputerEngineer engineer = new ComputerEngineer();
		engineer.makeComputer();
	}
}
