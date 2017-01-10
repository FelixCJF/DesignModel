package com.felix.singleton;
/**
 * 饿汉式单例模式
 */
public class Singleton {
	//私有化构造方法
	private Singleton(){}
	//创建私有静态的本类对象
	private static Singleton singleton = new Singleton();
	//提供共有静态的方法，返回本类对象
	public static Singleton getSingleton(){
		return singleton;
	}
}
/**
 * 懒汉式单例模式
 */
class Singleton2{
	//私有化构造方法
	private Singleton2(){}
	//创建一个私有静态的本类对象
	private static Singleton2 singleton2 = null;
	//提供共有静态方法，返回本类对象
	public static Singleton2 getSingleton2(){
		if (singleton2==null) {
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
}
