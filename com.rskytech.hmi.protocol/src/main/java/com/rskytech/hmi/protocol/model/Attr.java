package com.rskytech.hmi.protocol.model;

/**
 * 总线协议中定义的指标信息对象
 * @author robin
 *
 */
public class Attr {
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 缺省值
	 */
	private String defaultValue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	
}
