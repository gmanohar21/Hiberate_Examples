package com.mn.component;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class AmazonStore implements IECommerce {

	/*
	 * public float shopping(String[] items, float[] prices) { float total = 0.0f;
	 * for (float p : prices) { total += p; } return total; }
	 */
	public double shopping(String[] items, double prices[]) {
		double billAmt;
		billAmt = DoubleStream.of(prices).sum();
		return billAmt;
	}
	
}
