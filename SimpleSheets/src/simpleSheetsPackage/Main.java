package simpleSheetsPackage;

import java.util.Scanner;

public class Main {

		//members
		 static Scanner input = new Scanner(System.in);


	         
		//constructor 
		


		public static void main(String[] args) {
			
			Scanner create = new Scanner(System.in);
			
			//Order Number info
			System.out.println("Enter Order Number: ");
			int orderNumber = input.nextInt();
			System.out.println("Order #: " + orderNumber);
			
			//Customer Number info
			System.out.println("Enter Customer Number: ");
			int customerNumber = input.nextInt();
			System.out.println("Customer #: " + customerNumber);
			
			//Order date info
			System.out.println("Enter Order Date: ");
			String orderDate = create.nextLine();
			System.out.println("Order Date: " +  orderDate);
			
			//Customer name info
			System.out.println("Enter Customer Name: ");
			String customerName = create.nextLine();
			System.out.println("Customer Name: " +  customerName);
			
			//String sales Associate info
			System.out.println("Enter Sales Associate: ");
			String salesAssociate = create.nextLine();
			System.out.println("Sales Associate: " +  salesAssociate);
			
			//String Billing Address info
			System.out.println("Enter Billing Address: ");
			String billingAddress = create.nextLine();
			System.out.println("Billing Address: " +  billingAddress);
			
			//String Shipping Address info
			System.out.println("Enter Shipping Address: ");
			String shippingAddress = create.nextLine();
			System.out.println("Shipping Address: " +  shippingAddress);
			
			//String Product name info
			System.out.println("Enter Product Name: ");
			String productName = create.nextLine();
			System.out.println("Product Name: " +  productName);
			
			//Double Amount ordered info
			System.out.println("Enter Amount Ordered: ");
			double amountOrdered = create.nextDouble();
			System.out.println("Amount Ordered: " +  amountOrdered);
			
			//Double Price info
			System.out.println("Enter Total Price: ");
			double price = create.nextDouble();
			System.out.println("Total Price: " +  price );
			

	}

}
