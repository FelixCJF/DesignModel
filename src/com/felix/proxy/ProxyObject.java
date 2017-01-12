package com.felix.proxy;
/**
 * 代理类
 * 火车票代售点
 *
 */
public class ProxyObject implements AbstractObject {
	
	private AbstractObject abstractObject;
	
	//默认作为火车站的代理
	public ProxyObject(){
		abstractObject = new ReallyObject();
	}
	public ProxyObject(AbstractObject abstractObject){
		this.abstractObject = abstractObject;
	}

	public void queryTicket() {
		//表面上是代售点查的票，实际上还是在火车站查的
		this.abstractObject.queryTicket();
	}

	public void buyTicket() {
		//表面上是代售点买的票，实际上还是在火车站买的
		abstractObject.buyTicket();
	}

}
