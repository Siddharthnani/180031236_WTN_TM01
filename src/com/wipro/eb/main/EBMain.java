package com.wipro.eb.main;

public class EBMain {
	public static void main(String a[])
	{
	System.out.println(new ConnectionService().generateBill(130,100,"Commercial"));
	}
}
