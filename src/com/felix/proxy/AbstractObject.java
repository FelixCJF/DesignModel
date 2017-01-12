package com.felix.proxy;
/**
 * 代理对象和目标对象的共同接口
 * 卖票系统
 *
 */
interface AbstractObject {
	public void queryTicket();// 查询票
	public void buyTicket();//买票
}
