package com.felix.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者类
 * @author aspire
 *
 */
public class Subject {
	//观察者容器
	private List<Observer> observers = new ArrayList<Observer>();


	public void attach(Observer o){
		observers.add(o);
	}
	public void detach(Observer o) {
		observers.remove(o);
	}
	protected void notifyObserver(){
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
