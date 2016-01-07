package cs.shop.products;

import cs.shop.Product;

/**
 * Created by SSH20 on 06/01/2016.
 */
public class Banana extends Product {

	public static final String BANANA = "Banana";

	@Override
	public String name() {
		return BANANA;
	}

	public static Banana init() {
		return new Banana();
	}
}
