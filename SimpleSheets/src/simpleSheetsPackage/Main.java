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
			
			

	}

}
