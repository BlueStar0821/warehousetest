package com.zx;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String name;
	
	private Date brithday;

	public User() {		}

	public User(Integer id, String name, Date brithday) {
		this.id = id;
		this.name = name;
		this.brithday = brithday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBrithday() {
		return brithday;
	}

	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", brithday=" + brithday + "]";
	}

}