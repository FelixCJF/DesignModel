package com.felix.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * 观察者
 * @author aspire
 *
 */
public class ConcreteWeatherObserver implements Observer {

	//观察者名称
	private String ObserverName;
	
	public void update(Observable o, Object arg) {
		//推方式
		System.out.println(ObserverName + "收到了消息，目标推送了内容：" + arg);
		//拉模式
		System.out.println(ObserverName + "收到了消息，目标拉的内容是：" + ((ConcreteWeatherSubject)o).getContent());;
	}

	public String getObserverName() {
		return ObserverName;
	}

	public void setObserverName(String observerName) {
		ObserverName = observerName;
	}

	
}
