package com.flipacart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Bank 
{
	

public int getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(int ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


private int ifsccode;
  public Bank(int ifsccode, String name, HashSet<Customer> clist) {
	super();
	this.ifsccode = ifsccode;
	this.name = name;
	this.clist = clist;
}
@Override
public String toString() {
	return "\nBank [ifsccode=" + ifsccode + ", name=" + name + ", clist=" + clist + "]";
}


private String name;
  private HashSet<Customer> clist;
public HashSet<Customer> getClist() {
	return clist;
}
public void setClist(HashSet<Customer> clist) {
	this.clist = clist;
}
 
  
}
