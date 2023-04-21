import javax.validation.constraints.Positive;
import java.util.Scanner;

public class Purchase extends Mortgage{

    @Positive(message ="The currentBid field must be greater than 0." )
    public double loanAmount;
    @Positive(message ="The currentBid field must be greater than 0." )
    public double interestRate;
    @Positive(message ="The currentBid field must be greater than 0." )
    public int numberOfYears;

    public Purchase(double loanAmount, double numberOfYears, double interestRate) {
        super(loanAmount, numberOfYears, interestRate);
    }
    static Scanner scanner = new Scanner(System.in);

    public static Mortgage purchasePayment() {
        System.out.println();
        System.out.println("What is the price of the home?");
        System.out.println();
        double homeValue = Double.parseDouble(scanner.nextLine());

        System.out.println();
        System.out.println("How much is your down payment?");
        System.out.println();
        double downPayment = Double.parseDouble(scanner.nextLine());

        System.out.println();
        System.out.println("Enter your desired interest rate");
        System.out.println();

        double interestRate = Double.parseDouble(scanner.nextLine());
        double loanAmount = homeValue - downPayment;

        System.out.println();
        System.out.println("How many years do you want to finance for?");
        System.out.println();
        int numberOfYears = (int) Double.parseDouble(scanner.nextLine());

        System.out.println();

        Mortgage purchasePayment = new Mortgage(loanAmount, numberOfYears, interestRate);

        System.out.printf("Your total monthly payment is $%.2f" , purchasePayment.mortgagePayment());
        System.out.printf(" based on a loan amount of $%.0f", loanAmount);
        System.out.print(", at a " + interestRate + "%" + " rate, financed over " + numberOfYears + " years.");
        return purchasePayment;
    }



}
