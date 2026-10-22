import java.util.Scanner;
public class BasicShopInventoryTracker {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      boolean valid = false;
      boolean isRunning = true;
      String[][] product = {
        {"Smartphone", "AEP-001"},
        {"Smart Television", "AEP-002"},
        {"Amplifier", "AEP-003"},
        {"Desktop Computer", "AEP-004"},
        {"Rubber Duck", "AEP-005"}
      };
      String[] needStock = {
        "Okay",
        "Okay",
        "Okay",
        "Okay",
        "Okay"
      };
      double[] price = {
        15999,
        19999,
        11999,
        24999,
        99
      };
      int stockThreshold = 100;
      int[] stock = {
        524,
        311,
        224,
        332,
        152
      };
      int maxSold = 0;
      int[] unitSold = {
        0,
        0,
        0,
        0,
        0
      };
      System.out.println("BASIC SHOP INVENTORY TRACKER - ST. JACOB");
      while (isRunning) {
        for (int i = 1; i < 37; i++){
          System.out.print("= ");
        }
        System.out.println();
        System.out.printf("%-20s %5s %-10s %5s %-10s %5s %-10s %n", "Product", "|", "Code", "|", "Price", "|", "Stock");
        for (int i = 1; i < 37; i++){
          System.out.print("- ");
        }
        System.out.println();
        for (int i = 0; i < price.length; i++) {
          System.out.printf("%-20s %5s %-10s %5s %-10.2f %5s %-10d %n", product[i][0], "|", product[i][1], "|", price[i], "|", stock[i]);
        } 
        for (int i = 1; i < 37; i++){
          System.out.print("= ");
        } 
        System.out.println("\nProduct Stock State:");
        for (int i = 0; i < needStock.length; i++) {
          if (stock[i] < stockThreshold) {
            needStock[i] = "Needs Restocking";
          } else {
            needStock[i] = "Okay";
          }
          System.out.printf("%-2s %-16s %5s %-10s %n", ((i+1) + ". "), product[i][0], ":", needStock[i]);
        }
        for (int i = 1; i < 37; i++){
          System.out.print("= ");
        }
        System.out.println("\nProducts Sold:");
        for (int i = 0; i < unitSold.length; i++) {
          System.out.printf("%-2s %-16s %5s %-10s %n", ((i+1) + ". "), product[i][0], ":", unitSold[i]);
        }
        for (int i = 1; i < 37; i++){
          System.out.print("- ");
        }
        System.out.println("\nSubtotal Revenue by Product:");
        double totalRevenue = 0;
        for (int i = 0; i < unitSold.length; i++) {
          double subtotalRevenue = price[i] * unitSold[i];
          totalRevenue += subtotalRevenue;
          System.out.printf("%-20s %5s %-10.2f%n", product[i][0], ":", subtotalRevenue);
        }
        for (int i = 1; i < 37; i++){
          System.out.print("- ");
        }
        System.out.println();
        System.out.printf("%-20s %5s %-10.2f%n", "Total Store Revenue", ":", totalRevenue);
        for (int i = 1; i < 37; i++){
          System.out.print("- ");
        }
        System.out.println();
        maxSold = 0;
        for (int sold : unitSold) {
          if (sold > maxSold) {
            maxSold = sold;
          }
        }
        if (maxSold == 0) {
          System.out.printf("%-20s %5s %-10s %n", "Best Selling", ":", "No Product Yet");
        } else {
          System.out.printf("%-20s %5s", "Best Selling", ": ");
          for (int i = 0; i < unitSold.length; i++) {
            if (unitSold[i] == maxSold) {
              System.out.print(product[i][0] + " (" + maxSold + ")");
            }
          }
          System.out.println();
        }
        for (int i = 1; i < 37; i++){
          System.out.print("= ");
        }
        System.out.println();
        System.out.println("Main Menu:");
        System.out.println("1. Restock Supplies\n2. Buy Product as Customer\n3. Exit");
        for (int i = 1; i < 37; i++){
          System.out.print("= ");
        }
        System.out.println();
        System.out.printf("%-20s %6s", "Enter Input", ": ");
        int choice = in.nextInt();
        switch (choice) {
          case 1:
            for (int i = 1; i < 37; i++){
              System.out.print("= ");
            }
            System.out.println("\nRestock Supplies:");
            for(int i = 0; i < stock.length; i++) {
              System.out.print("Enter " + product[i][0] + " Stock Amount: ");
              int buyStock = in.nextInt();
              if (buyStock >= 0) {
                stock[i] += buyStock;
              } else {
                System.out.println("Stock amount cannot be negative.");
              }
            }
            break;
          case 2:
            for (int i = 1; i < 37; i++){
              System.out.print("= ");
            }
            System.out.println("\nBuy Product as Customer:");
            for(int i = 0; i < stock.length; i++) {
              System.out.print("Enter " + product[i][0] + " Amount to Buy: ");
              int buyProduct = in.nextInt();
              if (buyProduct < 0) {
                System.out.println("Purchase amount cannot be negative.");
              } else if (buyProduct > stock[i]) {
                System.out.println("Not enough stock available.");
              } else {
                stock[i] -= buyProduct;
                unitSold[i] += buyProduct;
              }
            }
            System.out.println();
            break;
          case 3:
            System.out.println("User has Exited the Program.");
            isRunning = false;
            break;
          default:
            System.out.println("Invalid menu choice.");
            break;
        }
      }
    }
}
