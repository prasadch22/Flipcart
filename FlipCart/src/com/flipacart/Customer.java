package com.flipacart;
import java.util.ArrayList;
import java.util.HashSet;

public class Customer 
{
	
   
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		return true;
	}

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
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
public Customer(int id, String name, int mobile, String bname, int acc_balance) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.bname = bname;
		this.acc_balance = acc_balance;
	}
private int id;
   private String name;
   @Override
public String toString() {
	return "\n Customer [id=" + id + ", name=" + name + ", mobile=" + mobile + ", bname=" + bname + ", acc_balance="
			+ acc_balance + "]";
}
private int mobile;
   private String bname;
   private int acc_balance;
public int getAcc_balance() {
	return acc_balance;
}
public void setAcc_balance(int acc_balance) {
	this.acc_balance = acc_balance;
}
}
