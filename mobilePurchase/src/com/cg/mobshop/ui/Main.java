package com.cg.mobshop.ui;

import java.util.Scanner;

import com.cg.mobshop.dto.PurchaseDetails;
import com.cg.mobshop.exception.PurchaseException;
import com.cg.mobshop.service.PurchaseService;
import com.cg.mobshop.service.PurchaseServiceImpl;


public class Main {

	public static void main(String[] args) throws PurchaseException {
		// TODO Auto-generated method stub
		PurchaseService service=new PurchaseServiceImpl();
		@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Customer Name ");
	    String name=sc.next();
	    System.out.println("Enter PhoneNo ");
	    String phone=sc.next();
	    System.out.println("Enter Mail-Id ");
	    String mail=sc.next();
	    System.out.println("Enter Mobile Id ");
	    int  mid=sc.nextInt();

	    PurchaseDetails pr=new PurchaseDetails();
	    pr.setCustname(name);
	    pr.setPhoneNo(phone);
	    pr.setMailId(mail);
	    pr.setMobileId(mid);
	    
	    int pd=service.addPurchaseDetails(pr);
        System.out.println("record updated" + pd);
	}

}
