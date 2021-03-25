package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entities.Product;

public class ProgramTest {
	
	Product product = new Product();
	
	public void productNameSetter() {
		product.setName("Cellphone");
	}
	
	public void productPriceSetter() {
		product.setPrice(1200.00);
	}
	
	public void productQuantitySetter() {
		product.setQuantity(5);
	}

	@Test
	public void testName() {
		productNameSetter();
		assertEquals("Cellphone", product.getName());
	}
	
	@Test
	public void testPrice() {
		productPriceSetter();
		Double price = 1200.00;
		assertEquals(price, product.getPrice());
	}
	
	@Test
	public void testQuantity() {
		productQuantitySetter();
		Integer quantity = 5;
		assertEquals(quantity, product.getQuantity());
	}

}
