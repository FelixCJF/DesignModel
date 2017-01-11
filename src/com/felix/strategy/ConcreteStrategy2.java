package com.felix.strategy;
/**
 * 这是具体的一个策略，诸葛亮的三个妙计之一
 */
public class ConcreteStrategy2 implements IStrategy {

	//一个可执行算法
	public void operate() {
		System.out.println("求吴国太开个绿灯,放行！");
	}

}
