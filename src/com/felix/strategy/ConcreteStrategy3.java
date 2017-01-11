package com.felix.strategy;
/**
 * 这是具体的一个策略，诸葛亮的三个妙计之一
 */
public class ConcreteStrategy3 implements IStrategy {

	//一个可执行算法
	public void operate() {
		System.out.println("孙夫人断后，挡住追兵");
	}
}
