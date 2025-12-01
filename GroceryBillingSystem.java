import java.util.*;
public class GroceryBillingSystem {

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
                    System.out.println("adminLogin()");
                    break;

                case 2:
                    cashierLogin();
                    break;

                case 3:
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }
static void cashierLogin() {
        
        int choice;

            System.out.println("\n===== CASHIER LOGIN =====");
            System.out.println("1. Login");
            System.out.println("2. Change Password");
        
            choice = sc.nextInt();


        switch(choice){
            case 1:
                System.out.print("Enter Cashier Username: ");
                String user = sc.next();
                System.out.print("Enter your 4 digit pin ");
                int pass = sc.nextInt();

                if (user.equals(CASHIER_USER) && pass==CASHIER_PASS) {
                cashierMenu();
                } else {
                 System.out.println("Invalid cashier details!");
                }
                break;
            case 2:
                System.out.println("\n===== CHANGE CASHIER PASSWORD =====");
    
                System.out.print("Enter current 4-digit pin: ");
                int oldPin = sc.nextInt();

                if (oldPin == CASHIER_PASS) {
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
                default:
                System.out.println("Invalid choice!");

    }
}
    static void cashierMenu() {
        double totalBill = 0;
        int choice;

        do {
            System.out.println("\n===== CASHIER MENU =====");
            System.out.println("1. View Items");
            System.out.println("2. Purchase Item");
            System.out.println("3. View Current Bill");
            System.out.println("4. Checkout & Print Bill");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("viewItems()");
                    break;

                case 2:
                    System.out.println("totalBill += purchaseItem()");
                    break;

                case 3:
                    System.out.println("Current Bill: Rs. " + totalBill);
                    break;

                case 4:
                    System.out.println("\n===== FINAL BILL =====");
                    System.out.println("Total amount: Rs. " + totalBill);
                    System.out.println("Thank you for shopping!");
                    totalBill = 0; // reset for next customer
                    break;

                case 5:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}

    