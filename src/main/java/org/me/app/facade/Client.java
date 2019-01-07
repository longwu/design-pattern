package org.me.app.facade;

/**
 * 门面模式
 * http://blog.csdn.net/jason0539/article/details/22775311
 * 
 * @author JasonWu
 *
 */
public class Client {
       public static void main(String[] args) {
    	   Facade facade = new Facade();
    	   facade.test();
       }
}
