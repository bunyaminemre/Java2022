package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";

		Product product1 = new Product(); // tip değişken = new Product (ilk tanımlanan class)
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpg");


		Product product2 = new Product(); // tip değişken = new Product (ilk tanımlanan class)
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image2.jpg");
	

		Product product3 = new Product(); // tip değişken = new Product (ilk tanımlanan class)
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image3.jpg");
	
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("<ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0500000000");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Bünyamin");
		individualCustomer.setLastName("İmamoğlu");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0522111444");
		corporateCustomer.setTaxNumber("1111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer [] customers = {individualCustomer,corporateCustomer};
		
		for (Customer customer:customers) {
			
			System.out.println("Id: "+customer.getId() + " " + "\nCustomer Number:  " + customer.getCustomerNumber());
		}
		
		
	}

}
