package com.xinglongjian.domain;

import java.io.Serializable;

public class Book implements Serializable{
	private long id;
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

}
