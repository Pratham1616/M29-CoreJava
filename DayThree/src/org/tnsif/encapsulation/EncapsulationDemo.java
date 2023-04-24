package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation
		HDFCBank h=new HDFCBank();
		
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