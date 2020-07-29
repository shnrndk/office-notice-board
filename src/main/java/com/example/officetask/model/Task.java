package com.example.officetask.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tid;
	private String tname;
	private String tdescription;
	private String tcreator;
	private String ttaker;
	private boolean is_done;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTdescription() {
		return tdescription;
	}
	public void setTdescription(String tdescription) {
		this.tdescription = tdescription;
	}
	public String getTcreator() {
		return tcreator;
	}
	public void setTcreator(String tcreator) {
		this.tcreator = tcreator;
	}
	public String getTtaker() {
		return ttaker;
	}
	public void setTtaker(String ttaker) {
		this.ttaker = ttaker;
	}
	public boolean isIs_done() {
		return is_done;
	}
	public void setIs_done(boolean is_done) {
		this.is_done = is_done;
	}
	
}
