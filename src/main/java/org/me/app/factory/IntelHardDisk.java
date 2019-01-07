package org.me.app.factory;

public class IntelHardDisk implements HardDisk {

	private int storage = 0;

	public IntelHardDisk(int storage) {
		this.storage = storage;
	}
	
	public void save() {
		System.out.println(String.format("IntelHardDisk can save %d GB file", this.storage));
	}
}
