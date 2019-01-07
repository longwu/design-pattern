package org.me.app.adapter;


/**
 * Adapter适配器将Target和Adaptee联系起来
 * 
 * Adaptee原本不支持接口Target,现在在适配器Adapter的帮助下支持了接口Target
 * 
 * @author JasonWu
 *
 */
public class Adapter extends Adaptee implements Target  {

	/**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
	public void sampleOperation2() {
		System.out.println("sampleOperation2 from Adapter");
	}
}
