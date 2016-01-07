package cs.shop.pricing;

import cs.shop.Basket;
import cs.shop.Product;
import cs.shop.products.Apple;
import cs.shop.products.Banana;
import cs.shop.products.Lime;
import cs.shop.products.Melon;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;


public class BasketPricingServiceTest {


	BasketPricingService pricingService;
	@Before
	public void setup(){

		Basket basket = new Basket();
		basket.addItems(Arrays.asList(Apple.init(),Banana.init(),Melon.init(),Lime.init()));
		pricingService =  new BasketPricingService(basket);
	}


	@Test
	public void calculateBasketPriceTest(){
		assertEquals(pricingService.calculateBasketPrice(), 1.20d, .01d);
	}

}