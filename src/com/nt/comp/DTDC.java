package com.nt.comp;

public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC::0 param Contructor");
		
	}

	@Override
	public String delever(int oid) {
		return "Dilivering"+oid+"order Id product using DTDC";
	}

}
