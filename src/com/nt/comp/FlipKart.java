package com.nt.comp;
import java.util.Arrays;
import java.util.Random;

public class FlipKart {
	private Courier courier;
	public FlipKart() {
		System.out.println("FlipKart::0 param Constructor");
	}
	public void setCourier(Courier courier) {
		System.out.println("FlipKart.setCourier()");
		this.courier = courier;
	}
//b.method
	public String shopping(String []items,float [] prices) {
		float billAmt=0.0f;
		for(float p:prices)
			billAmt+=p;//billAmt=billAmt+p
			//generate order id
			int oid=new Random().nextInt(1000);
			String msg=courier.delever(oid);
			return Arrays.toString(items)+"with prices "+Arrays.toString(prices)+"having billamt"+billAmt+":::"+msg;
	}
	}

