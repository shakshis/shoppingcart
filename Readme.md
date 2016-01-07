This project is implementation of Shopping cart in Java that calculates the price of a basket of shopping.

Items are presented one at a time, in a list, identified by name - for example "Apple" or "Banana".
Multiple items are present multiple times in the list, so for example ["Apple", "Apple", "Banana"] is a basket with two apples and one banana.

Items are priced as follows:
 - Apples are 35p each
 - Bananas are 20p each
 - Melons are 50p each, but are available as ‘buy one get one free’
 - Limes are 15p each, but are available in a ‘three for the price two’ offer


With the list of shopping given, This calculate the total cost of those items i.e basket. The whole program is designed in such a way that new products and offers can be added with no code change.

OfferService is used to apply the offers on the products in the basket. It is designed in such a way  that any offer can be applied on any product.

BasketPricingService is responsible to calculate the cost of the basket.

ProductPricingEngine is used to assign the price to the product. The price assigning logic to product is extrapolated in this class as the price can vary with time.

BasketPriceTest is the test class that assert the cost of basket with different combination of items.


