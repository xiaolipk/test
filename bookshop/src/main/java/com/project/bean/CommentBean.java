package com.project.bean;

public class CommentBean {
	private int id;
	private String name;
	private String time;
	private String message;
	private int c_b_id;
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public int getC_b_id() {
		return c_b_id;
	}
	public void setC_b_id(int c_b_id) {
		this.c_b_id = c_b_id;
	}
	
	@Override
	public String toString() {
		return "CommentBean [id=" + id + ", name=" + name + ", time=" + time + ", message=" + message + ", c_b_id="
				+ c_b_id + "]";
	}
	
	
	

}
