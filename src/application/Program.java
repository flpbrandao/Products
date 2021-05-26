package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> ProductList = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter the number of products:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product # " + i + " data:");
			System.out.println("Common/Used/Imported: c/u/i");
			char c = sc.next().charAt(0);

			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Price:");
			double price = sc.nextDouble();
			
			if (c =='i') {
				System.out.println("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, name, customsFee);
				ProductList.add(product);
			}
			else if (c =='u') {
				System.out.println("Manufacturing Date (DD/MM/YYYY): ");
				Date manufacturingDate = sdf.parse(sc.next());
				Product product = new UsedProduct(name, price, name, manufacturingDate);
				ProductList.add(product);
			}
			else {
				Product product = new Product(name, price, name);
				ProductList.add(product);
			}
			}
		
		System.out.println("PRICE TAGS: ");
		for (Product p: ProductList) {
			System.out.println (p.priceTag());
		}

		sc.close();
	}

}