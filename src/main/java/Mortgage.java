

import javax.validation.constraints.Positive;

public class Mortgage  {

    @Positive(message ="The currentBid field must be greater than 0." )
    double loanAmount;
    @Positive(message ="The currentBid field must be greater than 0." )
    static double interestRate;
    @Positive(message ="The currentBid field must be greater than 0." )
    int numberOfYears;


    public Mortgage(double loanAmount, double numberOfYears, double interestRate) {
        this.loanAmount = loanAmount;
        this.numberOfYears = (int) numberOfYears;
        this.interestRate = interestRate;

    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    double mortgagePayment() {
        double monthlyInterestRate = interestRate / 1200;
        int totalPayments = numberOfYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) / (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);
        return monthlyPayment;
    }

}
