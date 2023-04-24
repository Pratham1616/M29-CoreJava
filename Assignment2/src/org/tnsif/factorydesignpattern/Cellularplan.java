package org.tnsif.factorydesignpattern;

abstract class Cellularplan {
	protected double rate;
	abstract void getRate();
	public void processBill(int minutes) {
		System.out.println(minutes*rate);
		
	}

}