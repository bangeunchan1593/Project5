package com.example.bean;

import java.util.Date;

public class BoardVO {
	private int seq;
	private String restaurant;
	private String menu;
	private String price;
	private String open_time;
	private String close_time;
	private String location;
	private String star_point;
	private String review;
	private Date regdate;
	private int cnt;
	
	public int getSeq() { return seq; }
	public void setSeq(int seq) { this.seq = seq; }
	public String getRestaurant() { return restaurant; }
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOpen_time() {
		return open_time;
	}
	public void setOpen_time(String open_time) {
		this.open_time = open_time;
	}
	public String getClose_time() {
		return close_time;
	}
	public void setClose_time(String close_time) {
		this.close_time = close_time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStar_point() { return star_point; }
	public void setStar_point(String star_point) { this.star_point = star_point; }
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
