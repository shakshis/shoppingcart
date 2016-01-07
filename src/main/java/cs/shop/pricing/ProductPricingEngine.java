package cs.shop.pricing;

import cs.shop.products.Apple;
import cs.shop.products.Banana;
import cs.shop.products.Lime;
import cs.shop.products.Melon;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SSH20 on 06/01/2016.
 */
public class ProductPricingEngine {

	private static Map<String, Double> productPriceMap = new HashMap();

	static {
		productPriceMap.put(Apple.init().name(), .35);
		productPriceMap.put(Banana.init().name(), .20);
		productPriceMap.put(Melon.init().name(), .50);
		productPriceMap.put(Lime.init().name(), .15);
	}

	public static Double getPrice(String productName) {
		return productPriceMap.get(productName);
	}
}
