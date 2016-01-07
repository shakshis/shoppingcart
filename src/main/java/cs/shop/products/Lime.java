package cs.shop.products;

import cs.shop.Product;

/**
 * Created by SSH20 on 06/01/2016.
 */
public class Lime extends Product {

	public static final String LIME = "Lime";

	@Override
	public String name() {
		return LIME;
	}

	public static Lime init() {
		return new Lime();
	}
}
