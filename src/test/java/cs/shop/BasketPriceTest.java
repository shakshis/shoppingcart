package cs.shop;

import cs.shop.products.Apple;
import cs.shop.products.Banana;
import cs.shop.products.Lime;
import cs.shop.products.Melon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BasketPriceTest {


	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
						// Basket with one of each product
						{
								Arrays.asList(Apple.init(), Banana.init(), Melon.init(), Lime.init()), 1.20d
						},
						// Basket with 1 Melon
						{
								Arrays.asList(Melon.init()), .50d
						},
						//Basket with 2 Melons
						{
								Arrays.asList(Melon.init(), Melon.init()), .50d
						},
						//Basket with 3 Melons
						{
								Arrays.asList(Melon.init(), Melon.init(), Melon.init()), 1.0d
						},
						//Basket with 4 Melons
						{
								Arrays.asList(Melon.init(), Melon.init(), Melon.init(), Melon.init()), 1.0d
						},
						//Basket with 1 lime
						{
								Arrays.asList(Lime.init()), .15d
						},
						//basket with 2 Limes
						{
								Arrays.asList(Lime.init(), Lime.init()), .30d
						},
						//Basket with 3 Limes
						{
								Arrays.asList(Lime.init(), Lime.init(), Lime.init()), .30d
						},
						//basket with 4 Limes
						{
								Arrays.asList(Lime.init(), Lime.init(), Lime.init(), Lime.init()), .45d
						},
						//Basket with 6 Limes
						{
								Arrays.asList(Lime.init(), Lime.init(), Lime.init(), Lime.init(), Lime.init(), Lime.init()), .60d
						},
						//Basket with 1 Apple, 1 Banana, 2 Melons, 3 Limes
						{
								Arrays.asList(Apple.init(), Banana.init(), Melon.init(), Melon.init(), Lime.init(), Lime.init(), Lime.init()), 1.35d
						},

				}
		);
	}

	@Parameter
	public List<Product> products;

	@Parameter(value = 1)
	public double total;

	@Test
	public void basketPrice() {
		Basket basket = new Basket();
		basket.addItems(products);
		assertEquals(basket.getTotal(), total, .01d);
	}





}