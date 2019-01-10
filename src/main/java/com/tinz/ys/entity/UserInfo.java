package com.tinz.ys.entity;

public class UserInfo {
	private Integer id;
	private String username;
	private String cusername;
	private String district;
	private String role;
	private Integer psId;
	private String token;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCusername() {
		return cusername;
	}
	public void setCusername(String cusername) {
		this.cusername = cusername;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getPsId() {
		return psId;
	}
	public void setPsId(Integer psId) {
		this.psId = psId;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", username=" + username + ", cusername=" + cusername + ", district=" + district
				+ ", role=" + role + ", psId=" + psId + ", token=" + token + "]";
	}

}
