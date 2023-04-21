import java.util.EmptyStackException;
import java.util.Scanner;

public class MortgageApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("=========================================");
        System.out.println("\n" +
                "███╗░░░███╗░█████╗░██████╗░████████╗░██████╗░░█████╗░░██████╗░███████╗\n" +
                "████╗░████║██╔══██╗██╔══██╗╚══██╔══╝██╔════╝░██╔══██╗██╔════╝░██╔════╝\n" +
                "██╔████╔██║██║░░██║██████╔╝░░░██║░░░██║░░██╗░███████║██║░░██╗░█████╗░░\n" +
                "██║╚██╔╝██║██║░░██║██╔══██╗░░░██║░░░██║░░╚██╗██╔══██║██║░░╚██╗██╔══╝░░\n" +
                "██║░╚═╝░██║╚█████╔╝██║░░██║░░░██║░░░╚██████╔╝██║░░██║╚██████╔╝███████╗\n" +
                "╚═╝░░░░░╚═╝░╚════╝░╚═╝░░╚═╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝░╚═════╝░╚══════╝\n" +
                "\n" +
                "░█████╗░░█████╗░██╗░░░░░░█████╗░██╗░░░██╗██╗░░░░░░█████╗░████████╗░█████╗░██████╗░\n" +
                "██╔══██╗██╔══██╗██║░░░░░██╔══██╗██║░░░██║██║░░░░░██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗\n" +
                "██║░░╚═╝███████║██║░░░░░██║░░╚═╝██║░░░██║██║░░░░░███████║░░░██║░░░██║░░██║██████╔╝\n" +
                "██║░░██╗██╔══██║██║░░░░░██║░░██╗██║░░░██║██║░░░░░██╔══██║░░░██║░░░██║░░██║██╔══██╗\n" +
                "╚█████╔╝██║░░██║███████╗╚█████╔╝╚██████╔╝███████╗██║░░██║░░░██║░░░╚█████╔╝██║░░██║\n" +
                "░╚════╝░╚═╝░░╚═╝╚══════╝░╚════╝░░╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝");
        System.out.println("=========================================");
        System.out.println("Are you wanting to purchase or refinance a home? ");
        System.out.println("=========================================");
        System.out.println("1. PURCHASE");
        System.out.println("2. REFINANCE");
        System.out.println();
        boolean validOption = false;
        while (!validOption) {
            System.out.println("Please select 1 or 2");
            int choice = scanner.nextInt();
            try {
                if (choice == 1) {
                    Purchase.purchasePayment();
                    validOption = true;
                } else if (choice == 2) {
                    Refinance.refinancePayment();
                    validOption = true;
                } else {
                    System.out.println("Please choose the available option");
                }
            } catch (NullPointerException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}