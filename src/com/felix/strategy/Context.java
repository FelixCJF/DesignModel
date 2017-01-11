package com.felix.strategy;
/**
 * 环境类，上下文用来调用策略
 * 有妙计，这个类就相当于用来方妙计的锦囊
 */
public class Context {
	private IStrategy strategy;
	
	//构造函数，决定调用那个计策
	public Context(IStrategy strategy){
		this.strategy = strategy;
	}
	
	//使用策略，出招
	public void operate(){
		this.strategy.operate();
	}

}
