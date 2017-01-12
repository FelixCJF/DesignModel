package com.felix.proxy;
/**
 * 真正的目标对象
 * 火车站买票
 *
 */
public class ReallyObject implements AbstractObject{

	public void queryTicket() {
		System.out.println("在火车站查询票");
	}
	public void buyTicket() {
		System.out.println("在火车站买票");
	}
}
