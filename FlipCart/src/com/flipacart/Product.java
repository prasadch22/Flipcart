package com.flipacart;

public class Product 
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
		Product other = (Product) obj;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	





public Product(int id, int price, String name, int qty) {
	super();
	this.id = id;
	this.price = price;
	this.name = name;
	this.qty = qty;
}
@Override
public String toString() {
	return " \nProduct [id=" + id + ", price=" + price + ", name=" + name + ", qty=" + qty + "]";
}




private int id;
   private int price;
   private String name;
   private int qty;
   public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   
}
