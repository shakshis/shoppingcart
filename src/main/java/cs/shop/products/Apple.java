package cs.shop.products;

import cs.shop.Product;

/**
 * Created by SSH20 on 06/01/2016.
 */
public class Apple extends Product {

	public static final String APPLE = "Apple";

	@Override
	public String name() {
		return APPLE;
	}

	public static Apple init() {
		return new Apple();
	}


}
