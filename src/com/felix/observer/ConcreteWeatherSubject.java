package com.felix.observer;

import java.util.Observable;
/**
 * 天气目标类
 * @author aspire
 *
 */
public class ConcreteWeatherSubject extends Observable {

	//天气情况
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		//通知所有观察者天气情况，通知之前必须先调用setchanged（）
		this.setChanged();
		//推模式
		this.notifyObservers(content);
		//拉模式
		//this.notifyObservers();
	}
	
}
