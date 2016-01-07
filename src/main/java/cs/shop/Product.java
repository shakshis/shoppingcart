package cs.shop;

import cs.shop.pricing.ProductPricingEngine;

/**
 * Created by SSH20 on 06/01/2016.
 */
public abstract class Product {

	public abstract String name();

	public double price() {
		return ProductPricingEngine.getPrice(this.name());
	}

	@Override
	public boolean equals(Object obj) {
		Product p = (Product) obj;
		return this.name().equals(p.name());
	}

	@Override
	public int hashCode() {
		int hashCode = 0;
		for (int i = 0; i < name().length(); i++) {
			hashCode = 31 * hashCode + name().charAt(i);
		}
		return hashCode;
	}
}
