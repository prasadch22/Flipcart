package com.flipacart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ShopDetail implements ShopeingDetail
{
	
     
	  static  HashSet<Customer> clist=new HashSet<>();
      static  HashSet<Product> plist=new HashSet<>();
      static HashSet<Vendor> vlist=new HashSet<>();
      static HashSet<Bank> blist=new HashSet<>();
       

        static
        {
        	
        	Customer c1=new Customer(1, "A", 111, "SBI",15000);
  	      Customer c2=new Customer(2, "B", 122, "SBI",16000);
  	      Customer c3=new Customer(1, "C", 111, "SBI",9000);
  	    clist.add(c1);
  	    
        clist.add(c2);
        
        clist.add(c3);
        
       /* System.out.println("customer");
        System.out.println(clist);*/
        Product p1=new Product(1,500,"Laptop",15);
	       Product p2=new Product(2,500,"Dell",30);
	       Product p3=new Product(3,500,"Lenovo",40);
	       Product p4=new Product(1,100,"L",10);
	       
	       plist.add(p1);
	      
	       plist.add(p2);
	       plist.add(p3);
	       plist.add(p4);
	    /*   System.out.println("Product");
	       System.out.println(plist);*/
	       
        	Vendor v1=new Vendor(1,"Flipkart",1500,plist);
        	Vendor v2=new Vendor(2,"Amazaon",1500,plist);
        	vlist.add(v1);
        	vlist.add(v2);
        	/*System.out.println("vendor");
        	System.out.println(vlist);
        	
*/
        	//System.out.println(v2.getPlist());
        	Bank b1=new Bank(121, "SBI", clist);
        	   blist.add(b1);
        	
        }
	

	public Customer purchaseItem(int cid, int vid, int pid) 
	{
     
			  int q=0;
			  int qty=0;
			     for(Customer c:clist)
			     {
			    	 if(c.getId()==cid)
			    	 {
			    		 try {
							if(checkBalnce(cid))
							 {
								 for(Vendor v:vlist)
								 {
									 
									 if(v.getId()==vid)
									 {
										 HashSet<Product> p= v.getPlist();
										 for(Product p1:p)
										 {
											    if(p1.getId()==pid)
											    {
											    	
											    	int balance1=v.getAcc_no()+p1.getPrice();
											    	v.setAcc_no(balance1);
											    	
											    	qty=p1.getQty();
											    	   
											    	   p1.setQty(--qty);
											    	   System.out.println(v);
											    	   
											    	   
											    	   for(Bank b:blist)
											    	   {
											    		  
											    		 HashSet<Customer> clist1=b.getClist();
											    		     for(Customer c1:clist1)
											    		     {
											    		        if(c1.getBname()==b.getName())
											    		        {
											    		        	int balance=c1.getAcc_balance()-p1.getPrice();
															    	c1.setAcc_balance(balance);
											    		        }
											    		     }
										
											    	   }
											    	return c;
											    }
										 }
									 }
								 }
							 }
						} 
			    		 catch (InsufficientFund e) {
							e.printStackTrace();
						}
			    	 }
			    	 
			    	 
			     }
		
		
		
			return null;
	        
		      
		
	}
	boolean checkBalnce(int cid) throws InsufficientFund 
	{
		for(Customer c:clist)
		{
		  if(c.getId()==cid)
		  {
			  if(c.getAcc_balance()>10000)
			  {
				  return true;
			  }
			  else
			  {
				throw new InsufficientFund("Balance should be greater than 10k"); 
			  }
		  }
		  
		  }
		return false;
	}

	
	
	public Object[] addProduct(int vid, Product[] plist1) 
	{
		ArrayList<Product> alist=new ArrayList<>(Arrays.asList(plist1));
		                        
		        
		       for(Vendor v:vlist)
		       {
		    	   if(v.getId()==vid)
		    	   {
		    		   v.getPlist().addAll(alist);
		    		  // System.out.println(plist);
		    		   Object[] p=plist.toArray();
		    		   //System.out.println(v.getPlist());
		    		   return p;
		    	   }
		       }
			return plist1;
		
	}
	public int[] idReturn(int cid,int vid,int pid)
	{
		
		 for(Customer c:clist)
         {
        	 if(c.getId()==cid)
        	 {
        		 try {
					if(checkBalnce(cid))
					 {
						 for(Vendor v:vlist)
						 {
							 
							 if(v.getId()==vid)
							 {
								 HashSet<Product> p= v.getPlist();
								 for(Product p1:p)
								 {
									    if(p1.getId()==pid)
									    {
									    	
									    	int balance1=v.getAcc_no()+p1.getPrice();
									    	v.setAcc_no(balance1);
									    	//System.out.println(v);
									    	int qty=(p1.getQty());
									    	   qty--;
									    	   p1.setQty(qty);
									    	// System.out.println(v);
									    	   for(Bank b:blist)
									    	   {
									    		  
									    		 HashSet<Customer> clist1=b.getClist();
									    		     for(Customer c1:clist1)
									    		     {
									    		        if(c1.getBname()==b.getName())
									    		        {
									    		        	int balance=c1.getAcc_balance()-p1.getPrice();
													    	c1.setAcc_balance(balance);
													    	int arr[]={c1.getId(),v.getId(),p1.getId()};
											                   return arr;

									    		        }
									    		     }
									    	   }
									    	
									    }
								 }
							 }
						 }
					 }
				} 
        		 catch (InsufficientFund e) {
					e.printStackTrace();
				}
        	 }
        	 
        	 
         }
		return null;
	
	
		
        
	}
	boolean  checkId(int cid1,int vid1,int pid1 ) throws IdNotValid
	{
		if(cid1<=0 && vid1<=0 && pid1<=0)
		{
			throw new IdNotValid("Id should be greater than zero");
		}
		return true;
		
	}
	

}
class InsufficientFund extends Exception
{
	public InsufficientFund(String s)
	{
		super(s);
	}
}

class IdNotValid extends Exception
{
   	public IdNotValid(String s)
   	{
   		super(s);
   	}

}

