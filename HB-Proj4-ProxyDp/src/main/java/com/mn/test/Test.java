package com.mn.test;

import com.mn.component.IECommerce;
import com.mn.factory.ECommerceStoreFactory;

public class Test {
	public static void main(String[] args) {
		IECommerce commerce = null;
		commerce = ECommerceStoreFactory.getInstance(15);
		System.out.println(commerce.getClass());
		//System.out.println(commerce.shopping(new String[] { "santhi", "Malathi" }, new double[] { 20, 30 }));
		System.out.println(commerce.shopping(new String[] { "santhi", "Malathi" }, new double[] { 500, 300 }));
	}
}
