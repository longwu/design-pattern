package org.me.app.factory;

public class HardDiskFactory {
         
	public static HardDisk createHardDisk(HardDiskType type) {
		
		HardDisk hardDisk = null;
		switch (type) {
		case INTEL:
			hardDisk = new IntelHardDisk(100);
			break;
		case AMD:
			hardDisk = new AmdHardDisk(90);
			break;
		default:
			break;
		}
		return hardDisk;
	}
}
