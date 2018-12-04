package com.flipacart;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TestData 
{
    public static void main(String[] args) 
    {
    	


	     ShopDetail s=new ShopDetail();

          Customer c=s.purchaseItem(1, 1, 1);
           System.out.println(c);
	        
           Product p=new Product(5, 200, "Vadapav",20);
           Product pa[]={p};
            Object[] paa=s.addProduct(1, pa);
           //System.out.println(Arrays.toString(paa));
               Customer c1= s.purchaseItem(1, 2, 1);
        System.out.println(c1);
        System.out.println();
        //System.out.println(Arrays.toString(paa));
       int a[]= s.idReturn(1, 2, 1);
       //System.out.println("Information about id"+Arrays.toString(a));
                  

        
	      
	}
}
