package com.nt.comp;

public class FedEx implements Courier{
public FedEx() {
System.out.println("FedEx::O praram Constructor");
}
@Override
public String delever(int oid) {
	return "Delevering"+oid+"order id order product using FedEx";
}
}
