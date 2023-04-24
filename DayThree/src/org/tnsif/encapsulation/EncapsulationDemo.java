package org.tnsif.encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation
		HDFCbank h=new HDFCbank();
		
		//setter is used to set value
		h.setCardNo(23456789L);
		h.setCardType("Debit card");
		h.setCvvNo(444);
		h.setPinNo(1001);
		
		//getter is used to return value
		System.out.println(h.getCardNo());
		System.out.println(h.getCardType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());
		

	}

}