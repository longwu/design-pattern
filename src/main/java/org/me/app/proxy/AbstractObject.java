package org.me.app.proxy;

/**
 * 一个对象不能够直接访问其他对象
 * 
 * 抽象对象角色：声明了目标对象和代理对象的共同接口，
 * 这样一来在任何可以使用目标对象的地方都可以使用代理对象。
 * 
 * @author JasonWu
 *
 */
public abstract class AbstractObject {
    public abstract void operation(); 
}
