package com.springboot.demo.model;

public class User {
	
	private String name;
	private String location;
	private long age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", location=" + location + ", age=" + age + "]";
	}
	
	
	
	
}
