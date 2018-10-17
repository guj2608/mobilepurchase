package com.cg.mobshop.service;

import java.util.ArrayList;

import com.cg.mobshop.dao.PurchaseDao;
import com.cg.mobshop.dao.PurchaseDaoImpl;
import com.cg.mobshop.dto.Mobile;
import com.cg.mobshop.dto.PurchaseDetails;
import com.cg.mobshop.exception.PurchaseException;

public class PurchaseServiceImpl implements PurchaseService{
	
	PurchaseDao  dao;
	public PurchaseServiceImpl(){
		try{
	 dao= new PurchaseDaoImpl();	
	} catch(PurchaseException e)
		{
		e.printStackTrace();
		}}

	@Override
	public int addPurchaseDetails(PurchaseDetails pr) {
		// TODO Auto-generated method stub
		return dao.addPurchaseDetails(pr);
		
	}

	@Override
	public ArrayList<Mobile> getMobileList() {
		// TODO Auto-generated method stub
		return dao.getMobileList();
	}

	@Override
	public ArrayList<Mobile> getMobileList(int min, int max) {
		// TODO Auto-generated method stub
		return dao.getMobileList(min, max);
	}

	@Override
	public Mobile updateMobileDetails(Mobile mob) {
		// TODO Auto-generated method stub
		return dao.updateMobileDetails(mob);
	}

	
	

}
