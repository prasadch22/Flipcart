package com.flipacart;
import java.util.Arrays;
import java.util.HashSet;

public class Vendor 
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
		Vendor other = (Vendor) obj;
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
	
	
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
private int id;
  private String name;
  
  public Vendor(int id, String name, int acc_no, HashSet<Product> plist) {
	super();
	this.id = id;
	this.name = name;
	this.acc_no = acc_no;
	this.plist = plist;
}
@Override
public String toString() {
	return "Vendor [id=" + id + ", name=" + name + ", acc_no=" + acc_no + ", plist=" + plist + "]";
}
public HashSet<Product> getPlist() {
	return plist;
}
public void setPlist(HashSet<Product> plist) {
	this.plist = plist;
}
private int acc_no;
  private HashSet<Product> plist;
}
