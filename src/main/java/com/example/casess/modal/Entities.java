package com.example.casess.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Entities {
	@Id
	private int id;
	private String name;
	private String address;
	private String email;
	private String company_name;
	private boolean is_company;
	private Date created_at;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public boolean isIs_company() {
		return is_company;
	}
	public void setIs_company(boolean is_company) {
		this.is_company = is_company;
	}
	public Date getCreated_at() {
		return created_at;
	}
	@PrePersist
	public void setCreated_at() {
		this.created_at = new Date();
	}
	@Override
	public String toString() {
		return "Entities [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", company_name="
				+ company_name + ", is_company=" + is_company + ", created_at=" + created_at + "]";
	}
	
}
