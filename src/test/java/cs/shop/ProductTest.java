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

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

/**
 * Created by SSH20 on 06/01/2016.
 */


@RunWith(Parameterized.class)
public class ProductTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
						{
								Apple.init(), "Apple", .35d
						},
						{
								Banana.init(), "Banana", .20d
						},
						{
								Melon.init(), "Melon", .50d
						},
						{
								Lime.init(), "Lime", .15d
						}
				}
		);
	}

	@Parameter
	public Product product;

	@Parameter(value = 1)
	public String name;

	@Parameter(value = 2)
	public double price;


	@Test
	public void productNameAndPrice() {
		assertEquals(product.name(), name);
		assertEquals(product.price(), price, 0d);
	}
}
