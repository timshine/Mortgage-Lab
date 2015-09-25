
/**************************************
 *     Timothy Shine                  * 
 *     AP Lab 04 - Mortgage Payment   * 
 *     9/24/2015                      * 
 * 					                  *
 **************************************/

import java.text.DecimalFormat;

public class Mortgage {
	
	public static void main(String[] args)
	{
		System.out.println("Lab04a, Student Version\n");
		//Decimal Format for Two Decimal Places on answer
		DecimalFormat d = new DecimalFormat("0.00");
		
		
		//Initial Variables
		double principal  = 250000;
		double annualRate = 4.85;
		double numYears   = 30;
		
		//Necessary Variable Conversions for Equation
		double numMonths = numYears*12;
		double actualRate = annualRate/1200;
		
		//Calculating Monthly Payment
		double monthlyPaymentNumerator = (actualRate) * (Math.pow((1 + actualRate), numMonths ));
		double monthlyPaymentDenominator = Math.pow(1+actualRate,numMonths) - 1;
		double monthlyPayment = (monthlyPaymentNumerator/monthlyPaymentDenominator) * principal;

		//Outputting Mortgage
		System.out.println("Principal:       " + principal);
		System.out.println("Annual Rate:     " + annualRate + "%");
		System.out.println("Number of Years: " + numYears);
		System.out.println("Monthly Payment: " + d.format(monthlyPayment));

		//Total Payments
		double totalPayment = monthlyPayment * 12 * numYears;
		System.out.println("Total Payment:   " + d.format(totalPayment));
		
		//Total Interest 
		double totalInterest = totalPayment - principal;
		System.out.println("Total Interest:  " + d.format(totalInterest));
		 
		System.out.println();
	}

}
