package com.mn.proxy;

import com.mn.component.IECommerce;
import com.mn.component.AmazonStore;

public class ECommereceDiscountPrxy implements IECommerce {

	private IECommerce real;
	private float discount;

	//if discount dosent comes it goes to real class
	public ECommereceDiscountPrxy(float discount) {
		real = new AmazonStore();
		this.discount = discount;
	}

	
	@Override
	public double shopping(String[] items, double[] prices) {
		double billAmt=0.0f;
		double finalAmt=0.0f;
		//use real object
		billAmt=real.shopping(items, prices);
		//give the discount
		finalAmt=billAmt-(billAmt*discount/100);
		return finalAmt;
	}

}
