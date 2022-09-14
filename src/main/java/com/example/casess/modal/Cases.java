package com.example.casess.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cases {
	@Id
	private int id;
	private String case_number;
	private Date created_at;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCase_number() {
		return case_number;
	}
	public void setCase_number(String case_number) {
		this.case_number = case_number;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreate_at(Date created_at) {
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "Cases [id=" + id + ", case_number=" + case_number + ", create_at=" + created_at + "]";
	}
	public Cases() {
		super();
	}
	public Cases(String case_number, Date created_at) {
		super();
		this.case_number = case_number;
		this.created_at = created_at;
	}
}
