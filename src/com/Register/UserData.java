package com.Register;

public class UserData {

	private String username;
	private String password;
	private String name;
	private String sex;
	private String phone;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "UserData [username=" + username + ", password=" + password
				+ ", name=" + name + ", sex=" + sex + ", phone=" + phone + "]";
	}

	public UserData() {
		// TODO Auto-generated constructor stub
	}

}
