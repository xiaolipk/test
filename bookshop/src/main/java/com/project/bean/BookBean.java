package com.project.bean;

public class BookBean {
	private int id;
	private String name;
	private double price;
	private String type;
	private int comment;
	private String imgName;
	private int number;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "BookBean [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", comment=" + comment
				+ ", imgName=" + imgName + ", number=" + number + "]";
	}
	
	
     
	
	
	

}
