package application;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Product product = new Product();
		Map<Integer, Product> map = new HashMap<>();
		int cont = 0;
		
		try {
			System.out.print("Welcome. Press 1 to add a product, 2 to look for price of a product, 3 to list all the products, or 0 to quit: ");
			String decision = input.nextLine();			
			
			do {
				if (decision.equals("1")) {	// Option 1 -- Add product
					System.out.print("Enter the product name: ");
					String cleanedName = input.nextLine().replaceAll("\\p{Punct}", "");

					System.out.print("Enter the product price: R$ ");
					Double price = input.nextDouble();
					input.nextLine();

					System.out.print("Enter the product description: ");
					String description = input.nextLine();

					System.out.print("Enter the product quantity: ");
					Integer quantity = input.nextInt();
					input.nextLine();

					System.out.print("Enter the product category: ");
					String category = input.nextLine();

					product = new Product(cleanedName, price, description, quantity, category);
					map.put(cont, product);
					cont++;

					System.out.println("\nProduct added!");
				}

				if (decision.equals("2")) {	// Option 2 -- Search a product by name
					boolean found = false;
					System.out.print("Product Name: ");
					String searchProduct = input.nextLine().toLowerCase();
					System.out.println();
					for (Entry<Integer, Product> a : map.entrySet()) {
						String productName = a.getValue().getName().toString().toLowerCase();
						if (productName.contains(searchProduct)) {
							System.out.println(a.getValue());
							found = true;
						}
					}
					if (found == false) {
						System.out.println("Didn't found.");
					}
				}

				if (decision.equals("3")) { // Option 3 -- List all Products
					for (Entry<Integer, Product> a : map.entrySet()) {
						System.out.println(a.getValue());
					}
				}

				if (decision.equals("0")) {	// Option 0 -- Exit application
					System.out.print("Goodbye!");
					break;
				}

				System.out.print("Press 1 to add a product, 2 to look for price of a product, 3 to list all the products, or 0 to quit: ");	// Menu
				decision = input.nextLine();

			} while (!decision.equals("0")); // The program will break only if the decision will '0' (Exit Program)
			

		} catch (InputMismatchException i) {
			System.out.println("Please insert valid data.");
			main(args);
		}
		finally {
			input.close();
		}
	}
}
