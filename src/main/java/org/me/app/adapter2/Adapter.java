package org.me.app.adapter2;


/**
 * Adapter适配器将Target和Adaptee联系起来
 * 
 * @author JasonWu
 *
 */
public class Adapter implements Target  {

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
	  this.adaptee = adaptee;	
	}
	
	public void sampleOperation2() {
		System.out.println("sampleOperation2 from Adapter");
	}

	public void sampleOperation1() {
		this.adaptee.sampleOperation1();
	}
}
