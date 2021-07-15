package com.mn.factory;

import com.mn.component.AmazonStore;
import com.mn.component.IECommerce;
import com.mn.proxy.ECommereceDiscountPrxy;

public class ECommerceStoreFactory {

public static IECommerce getInstance(float discount) {
	if (discount==0) {
		return new AmazonStore();
	}else {
		return new ECommereceDiscountPrxy(discount);
	}
}

}
