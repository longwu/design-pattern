package org.me.app.prototype2;

public interface Prototype {
	public Prototype clone();
    public String getName();
    public void setName(String name);
}
