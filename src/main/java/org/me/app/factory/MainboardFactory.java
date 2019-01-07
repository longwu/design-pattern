package org.me.app.factory;

public class MainboardFactory {

	public static Mainboard create(MainboardType type) {
		Mainboard mainboard = null;
		switch (type) {
		case INTEL:
			mainboard = new IntelMainboard(100);
			break;
		case AMD:
			mainboard = new AmdMainboard(150);
		default:
			break;
		}
		return mainboard;
	}
}
