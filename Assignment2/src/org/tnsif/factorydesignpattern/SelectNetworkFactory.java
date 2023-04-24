package org.tnsif.factorydesignpattern;

public class SelectNetworkFactory {
	public Cellularplan getPlan(String planType) {
		if (planType==null) {
			return null;
		}
		if(planType.equalsIgnoreCase("abcNetwork")) {
			return new AbcNetwork();
		}
		else if(planType.equalsIgnoreCase("pqrNetwork")) {
			return new PqrNetwork();
		}
		else if(planType.equalsIgnoreCase("xyzNetwork")) {
			return new XyzNetwork();
		}
		return null;
	}

}