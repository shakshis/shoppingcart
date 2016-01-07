package cs.shop.offer;

import cs.shop.products.Lime;
import cs.shop.products.Melon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfferServiceTest {

	OfferService offerService;

	@Before
	public void setup(){
		offerService =  new OfferService();
	}

	@Test
	public void apply(){
		assertEquals(offerService.apply(Melon.MELON,2) ,1);
		assertEquals(offerService.apply(Melon.MELON,3) ,2);
		assertEquals(offerService.apply(Melon.MELON,4) ,2);
		assertEquals(offerService.apply(Melon.MELON,5) ,3);

		assertEquals(offerService.apply(Lime.LIME, 2), 2);
		assertEquals(offerService.apply(Lime.LIME, 3), 2);
		assertEquals(offerService.apply(Lime.LIME, 5), 4);
		assertEquals(offerService.apply(Lime.LIME, 6), 4);
	}

}