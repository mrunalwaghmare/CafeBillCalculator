import java.util.Scanner;

public class CafeBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----- Welcome to Java Cafe -----");
        System.out.println("Menu:\n1. Coffee - ₹50\n2. Tea - ₹30\n3. Sandwich - ₹70\n4. Burger - ₹100");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        if (qty <= 0) {
            System.out.println("❌ Invalid quantity. Must be greater than 0.");
        } else {
            int price = 0;
            String itemName = "";

            switch (choice) {
                case 1:
                    price = 50;
                    itemName = "Coffee";
                    break;
                case 2:
                    price = 30;
                    itemName = "Tea";
                    break;
                case 3:
                    price = 70;
                    itemName = "Sandwich";
                    break;
                case 4:
                    price = 100;
                    itemName = "Burger";
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please select from 1 to 4.");
                    return;
            }

            int total = price * qty;
            System.out.println("✅ Order Summary:");
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + qty);
            System.out.println("Total Bill: Rs " + total);
        }

        sc.close();
    }
}
