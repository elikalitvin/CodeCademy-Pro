public class CarLoan {
	public static void main(String[] args) {
    
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;
    
    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan) {
      System.out.println("You down payment is either greater or equal to the car price. The car can be paid in full without a loan.");
    } else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months; /*no interest per month*/
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);    
      
    }
      	
	}
}

/* This program calculates the monthly car payment a user should expect to make after taking out a car loan. 
It has variables such as interest rate and down payment (the amount of money a user puts for the first time
to cover some part of the price). */
