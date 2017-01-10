package com.felix.observer;
/**
 * 具体观察者
 * @author aspire
 *
 */
public class ConcreteObserver implements Observer {
	//观察者状态
	private String observerState;

	/**
	 * 获取目标类的状态，同步到观察者中
	 */
	public void update(Subject subject) {
		observerState = ((ConcreteSubject)subject).getState();
	}
}
