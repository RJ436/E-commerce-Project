package com.mobitel.MoBitelBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Supplier 
{
	@Id
	@GeneratedValue
	int suppid;
	
	public int getSuppid() {
		return suppid;
	}

	public void setSuppid(int suppid) {
		this.suppid = suppid;
	}

	public String getSuppname() {
		return suppname;
	}

	public void setSuppname(String suppname) {
		this.suppname = suppname;
	}
	public String getSuppaddr() {
		return suppaddr;
	}

	public void setSuppaddr(String suppaddr) {
		this.suppaddr = suppaddr;
	}



	String suppname,suppaddr;

	
}
