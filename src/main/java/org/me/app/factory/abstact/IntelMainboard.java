package org.me.app.factory.abstact;

public class IntelMainboard implements Mainboard {

	private int cpuHoles = 0;

	public IntelMainboard(int cpuholes) {
		this.cpuHoles = cpuholes;
	}
	
	public void installCPU() {
		System.out.println(String.format("IntelMainboard cpuHoles: %s",cpuHoles));
	}
}
