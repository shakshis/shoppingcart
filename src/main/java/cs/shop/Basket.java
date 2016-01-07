package cs.shop;

import cs.shop.pricing.BasketPricingService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SSH20 on 06/01/2016.
 */
public class Basket {

	List<Product> items;
	double total;

	public Basket() {
		items = new ArrayList();
		total = 0.0;
	}

	public synchronized void addItem(Product product) {
		this.items.add(product);
	}

	public synchronized void addItems(List<Product> products) {
		this.items.addAll(products);
	}

	public synchronized List<Product> getItems() {
		return items;
	}

	public double getTotal() {
		return new BasketPricingService(this).calculateBasketPrice();
	}

}
