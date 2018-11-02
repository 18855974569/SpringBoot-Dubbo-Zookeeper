package com.wjx.dubbo.pojo;

import java.io.Serializable;

/**
 * 用来测试的用户对象
 * @Title:  User.java   
 * @Package com.wjx.dubbo.pojo   
 * @Description: 
 * @author: wjx     
 * @date:   2018年11月3日 上午1:08:40   
 * @version V1.0
 */
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String name ;
	private String age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
