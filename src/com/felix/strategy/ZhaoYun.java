package com.felix.strategy;
/**
 *赵云出场，调用策略
 */
public class ZhaoYun {
	public static void main(String[] args) {
		Context context;
		//刚刚到吴国的时候拆第一个
		System.out.println("---刚刚到吴国的时候拆第一个---");
		context = new Context(new ConcreteStrategy1());
		context.operate();
		
		//刘备乐不思蜀了，拆第二个了
		System.out.println("---刘备乐不思蜀了，拆第二个了---");
		context = new Context(new ConcreteStrategy2());
		context.operate();
		
		//孙权的小兵追了，咋办？拆第三个
		System.out.println("---孙权的小兵追了，咋办？拆第三个---");
		context = new Context(new ConcreteStrategy3());
		context.operate();
	}
}
