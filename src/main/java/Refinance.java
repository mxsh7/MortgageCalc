import java.util.Scanner;

import static java.lang.System.out;

public class Refinance extends Mortgage{


    public double loanAmount;
    public double interestRate;
    public int numberOfYears;

    public Refinance(double loanAmount, double numberOfYears, double interestRate) {
        super(loanAmount, numberOfYears, interestRate);
    }

    static Scanner scanner = new Scanner(System.in);



    public static Mortgage refinancePayment() {
        double amountOfCash = 0;
        double mortgageBalance = 0;
        double loanAmount = mortgageBalance + amountOfCash;
        boolean validOption = false;
        while (!validOption){
            try {
            System.out.println();
            System.out.println("What is the value of your home?");
            System.out.println();
            double homeValue = Double.parseDouble(scanner.nextLine());

            System.out.println();
            System.out.println("How much do you owe on your mortgage");
            System.out.println();
            mortgageBalance = Double.parseDouble(scanner.nextLine());

            System.out.println();
            System.out.println("Do you want to take cash out? Y or N");
            System.out.println();
            String cashOut = scanner.nextLine().toUpperCase();

            if (cashOut.equals("Y")) {
                System.out.println();
                System.out.println("How much cash do you want to take out?");
                System.out.println();
                amountOfCash = Double.parseDouble(scanner.nextLine());
                loanAmount = mortgageBalance + amountOfCash;

                if (mortgageBalance + amountOfCash <= homeValue * .8) {
                    System.out.println();
                    System.out.println("Enter your desired interest rate");
                    System.out.println();
                    double interestRate = Double.parseDouble(scanner.nextLine());
                    System.out.println();
                    System.out.println("How many years do you want to finance for?");
                    System.out.println();
                    int numberOfYears = (int) Double.parseDouble(scanner.nextLine());
                    System.out.println();
                    Mortgage refinancePayment = new Mortgage(loanAmount, numberOfYears, interestRate);

                    System.out.printf("Your total monthly payment is $%.2f", refinancePayment.mortgagePayment());
                    System.out.printf(" based on a loan amount of $%.0f", loanAmount);
                    System.out.print(", at a " + interestRate + "%" + " rate, financed over " + numberOfYears + " years.");

                    return refinancePayment;
                } else {
                    System.out.println("You do not have enough equity in your home to get the cash out");
                }
            }

            System.out.println();
            System.out.println("Enter your desired interest rate");
            System.out.println();
            double interestRate = Double.parseDouble(scanner.nextLine());
            System.out.println();
            System.out.println("How many years do you want to finance for?");
            System.out.println();
            int numberOfYears = (int) Double.parseDouble(scanner.nextLine());
            System.out.println();
            loanAmount = mortgageBalance;
            Mortgage refinancePayment = new Mortgage(loanAmount, numberOfYears, interestRate);

            System.out.printf("Your total monthly payment is $%.2f", refinancePayment.mortgagePayment());
            System.out.printf(" based on a loan amount of $%.0f", loanAmount);
            System.out.print(", at a " + interestRate + "%" + " rate, financed over " + numberOfYears + " years.");

            return refinancePayment;


        } catch (Exception ex) {
            out.println("Invalid input");
        }}
        return null;
    }
}
