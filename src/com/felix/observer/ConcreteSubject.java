package com.felix.observer;

public class ConcreteSubject extends Subject {

	//目标对象的状态
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		this.notifyObserver();
	}	
}
