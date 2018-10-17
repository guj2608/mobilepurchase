package com.cg.mobshop.dao;

import java.util.ArrayList;

import com.cg.mobshop.dto.Mobile;
import com.cg.mobshop.dto.PurchaseDetails;

public interface PurchaseDao {
	public int addPurchaseDetails(PurchaseDetails pr);
	public  ArrayList<Mobile> getMobileList();
	public ArrayList<Mobile> getMobileList(int min,int max);
	public Mobile updateMobileDetails(Mobile mob);

}
