package com.nt.comp;

public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart::0 param Contructor");
		
	}

	@Override
	public String delever(int oid) {
		return "Dilivering"+oid+"order Id product using BlueDart";
	}

}
