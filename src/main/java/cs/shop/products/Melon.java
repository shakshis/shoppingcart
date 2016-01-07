package cs.shop.products;

import cs.shop.Product;

/**
 * Created by SSH20 on 06/01/2016.
 */
public class Melon extends Product {

	public static final String MELON = "Melon";

	@Override
	public String name() {
		return MELON;
	}

	public static Melon init() {
		return new Melon();
	}
}
