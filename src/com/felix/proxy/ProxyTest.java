package com.felix.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		//创建代理对象
		ProxyObject proxyObject = new ProxyObject();
		//执行买票
		proxyObject.queryTicket();
		proxyObject.buyTicket();
	}

}
