import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        processOrders();
    }

    public static void processOrders() {
        Scanner scanner = new Scanner(System.in);
        int totalOrders = 0;
        double totalPrice = 0;

        System.out.print("Enter the number of orders: ");
        totalOrders = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character from the previous input

        for (int i = 1; i <= totalOrders; i++) {
            System.out.println("Processing order " + i + ":");
            System.out.print("Enter the item name: ");
            String itemName = scanner.nextLine();
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter the price per unit: ");
            double pricePerUnit = scanner.nextDouble();
            scanner.nextLine(); // Clear the newline character from the previous input

            double orderTotal = quantity * pricePerUnit;
            System.out.println("Order Total: $" + orderTotal);
            totalPrice += orderTotal;
        }

        System.out.println("Total Orders: " + totalOrders);
        System.out.println("Total Price: $" + totalPrice);

        scanner.close();
    }
}
