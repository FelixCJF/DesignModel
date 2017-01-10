package com.felix.observer;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void WeatherTest(){
		//创建一个天气类作为被观察者
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		
		//创建观察者小明
		ConcreteWeatherObserver boy = new ConcreteWeatherObserver();
		boy.setObserverName("小明");
		
		//创建观察者小红
		ConcreteWeatherObserver girl = new ConcreteWeatherObserver();
		girl.setObserverName("小红");
		
		//注册观察者
		subject.addObserver(boy);
		subject.addObserver(girl);
		
		//天气更新
		subject.setContent("天气晴");
	}
}
