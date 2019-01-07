package org.me.app.prototype2;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
	private static Map<String, Prototype> map = new HashMap<String, Prototype>();

	private PrototypeManager() {
	}

	public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
		map.put(prototypeId, prototype);
	}

	public synchronized static void removePrototype(String prototypeId) {
		if (map.containsKey(prototypeId))
			map.remove(prototypeId);
	}

	public synchronized static Prototype getPrototype(String prototypeId) {
		return map.get(prototypeId);
	}
}
