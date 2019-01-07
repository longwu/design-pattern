package org.me.app.factory;

public class AmdMainboard implements Mainboard {

	private int cpuHoles = 0;

	public AmdMainboard(int cpuholes) {
		this.cpuHoles = cpuholes;
	}
	
	public void installCPU() {
		System.out.println(String.format("AmdMainboard cpuHoles: %s", this.cpuHoles));
	}
}
