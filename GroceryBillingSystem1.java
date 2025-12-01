import java.util.*;
public class GroceryBillingSystem1 {

    static Scanner sc = new Scanner(System.in);

    
    static final String ADMIN_USER = "admin";
    static int ADMIN_PASS = 1234;

    static final String CASHIER_USER = "cashier";
    static int CASHIER_PASS = 1111;

    public static void main(String[] args) {
       

        int choice;
        do {
            System.out.println("\n===== GROCERY STORE SYSTEM =====");
            System.out.println("1. Admin Login");
            System.out.println("2. Cashier Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    adminLogin();
                    break;

                case 2:
                     System.out.println("cashierLogin()");
                    break;

                case 3:
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }
    static void adminLogin() {
        
        int choice;

            System.out.println("\n===== ADMIN LOGIN =====");
            System.out.println("1. Login");
            System.out.println("2. Change Password");
        
            choice = sc.nextInt();


        switch(choice){
            case 1:
                System.out.print("Enter Admin Username: ");
                String user = sc.next();
                System.out.print("Enter your 4 digit pin ");
                int pass = sc.nextInt();

                if (user.equals(ADMIN_USER) && pass==ADMIN_PASS) {
                adminMenu();
                } else {
                 System.out.println("Invalid cashier details!");
                }
                break;
            case 2:
                System.out.println("\n===== CHANGE ADMIN PASSWORD =====");
    
                System.out.print("Enter current 4-digit pin: ");
                int oldPin = sc.nextInt();

                if (oldPin == ADMIN_PASS) {
                    System.out.print("Enter new 4-digit pin: ");
                    int newPin = sc.nextInt();

                    System.out.print("Confirm new 4-digit pin: ");
                    int confirmPin = sc.nextInt();

                if (newPin == confirmPin) {
                    CASHIER_PASS = newPin;   
                    System.out.println("Password changed successfully!");
                } else {
                    System.out.println("New PINs do not match!");
                }
                } else {
                    System.out.println("Incorrect current PIN!");
                }
                break;
        }
    }
    static void adminMenu() {
        double totalSales = 0;
        double totalCost = 0;
        double totalProfit = 0;

        int choice;
        do {
            System.out.println("\n===== ADMIN MENU =====");
            System.out.println("1. View Items");
            System.out.println("2. Add New Item");
            System.out.println("3. Change Item Price");
            System.out.println("4. Delete Item");
            System.out.println("5. View Total Sales");
            System.out.println("6. View Total Profit");
            System.out.println("7. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("out viewItems()");
                    break;

                case 2:
                    System.out.println("addItem()");
                    break;

                case 3:
                    System.out.println("changePrice()");
                    break;

                case 4:
                     System.out.println("deleteItem()");
                    break;

                case 5:
                    System.out.println("\n===== TOTAL SALES =====");
                    System.out.println("Total Sales: Rs " + totalSales);
                    break;

                case 6:
                    System.out.println("\n===== TOTAL PROFIT =====");
                    System.out.println("Total Profit: Rs " + totalProfit);
                    break;

                case 7:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);
    }
}
