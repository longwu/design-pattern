package org.me.app.factory.abstact;

public class IntelCpu implements Cpu {

	private int pins = 0;
	
	public IntelCpu(int pins) {
		this.pins = pins;
	}
	
	public void calculate() {
          System.out.println(String.format("IntelCpu pins: %s", this.pins));
	}
}
