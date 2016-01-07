package cs.shop.offer;

import cs.shop.products.Lime;
import cs.shop.products.Melon;

import java.util.HashMap;
import java.util.Map;

import static cs.shop.offer.Offer.BUY_ONE_GET_FREE;
import static cs.shop.offer.Offer.THREE_FOR_PRICE_TWO;

/**
 * Created by SSH20 on 07/01/2016.
 */
public class OfferService {
	static Map<String, Offer> offerMap = new HashMap();

	static {
		offerMap.put(Melon.MELON, BUY_ONE_GET_FREE);
		offerMap.put(Lime.LIME, THREE_FOR_PRICE_TWO);
	}


	public boolean offerAvailable(String productName) {
		return offerMap.get(productName) != null;
	}

	public int apply(String productName, int originalQty) {
		int divisor;
		int remainder;
		int offeredQty = 0;
		switch (offerMap.get(productName)) {
			case BUY_ONE_GET_FREE:
				divisor = originalQty / 2;
				remainder = originalQty % 2;
				offeredQty = divisor + remainder;
				break;
			case THREE_FOR_PRICE_TWO:
				divisor = originalQty / 3;
				remainder = originalQty % 3;
				offeredQty = (divisor * 2) + remainder;
		}
		return offeredQty;
	}
}
