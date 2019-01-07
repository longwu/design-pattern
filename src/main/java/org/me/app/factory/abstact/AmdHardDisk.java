package org.me.app.factory.abstact;

public class AmdHardDisk implements HardDisk {

	private int storage = 0;
	
	public AmdHardDisk(int storage) {
		this.storage = storage;
	}
	
	public void save() {
          System.out.println(String.format("AmdHardDisk can save %d GB file", this.storage));
	}
}
