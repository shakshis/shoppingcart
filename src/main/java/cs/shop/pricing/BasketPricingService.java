package cs.shop.pricing;

import cs.shop.Basket;
import cs.shop.Product;
import cs.shop.offer.OfferService;

import java.util.*;

/**
 * Created by SSH20 on 06/01/2016.
 */
public class BasketPricingService {

	private Basket basket;
	private OfferService offerService;

	public BasketPricingService(Basket basket) {
		this.basket = basket;
		this.offerService = new OfferService();
	}

	public double calculateBasketPrice() {
		double total = 0.0;
		Map<Product, Integer> basketProductsWithQty = applyOffer();
		for (Product product : basketProductsWithQty.keySet()) {
			total = total + product.price() * basketProductsWithQty.get(product);
		}
		return total;
	}

	private Map<Product, Integer> applyOffer() {
		Map<Product, Integer> productCountMap = countItemsGroupByProduct();
		for (Product product : productCountMap.keySet()) {
			if (offerService.offerAvailable(product.name())) {
				int newQuantity = offerService.apply(product.name(), productCountMap.get(product));
				productCountMap.put(product, newQuantity);
			}
		}
		return productCountMap;

	}

	private Map<Product, Integer> countItemsGroupByProduct() {
		Map<Product, Integer> productCountMap = new HashMap();
		List<Product> items = basket.getItems();
		Set<Product> uniqueProductSet = new HashSet();
		uniqueProductSet.addAll(items);
		for (Product product : uniqueProductSet) {
			productCountMap.put(product, Collections.frequency(items, product));
		}
		return productCountMap;
	}

}
