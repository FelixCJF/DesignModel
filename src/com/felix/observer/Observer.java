package com.felix.observer;
/**
 * 观察者
 * @author aspire
 *
 */
public interface Observer {
	/**
	 * 更新接口
	 * @param subject 传入的具体目标类
	 */
	public void update(Subject subject);
}
