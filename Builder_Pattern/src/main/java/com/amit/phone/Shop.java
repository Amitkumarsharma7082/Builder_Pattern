package com.amit.phone;

public class Shop 
{
public static void main(String a[])
{
	Phone p= new PhoneBuilder().setOs("Android").setRam(2).getPhone();
	
	System.out.println(p);
}
}
