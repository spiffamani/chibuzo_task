import java.util.Scanner;
public class InterestRates {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

double principal;
double rate;
double rate1;
double years;
double sumrate;
double sumrate1;
double sumrate2;
double sumrate3;
double month;
double yearlyrate;
double monthlyrate;


System.out.println(" Enter principal amount");
 principal = input.nextDouble();

System.out.println("Enter annual interest rate");
yearlyrate = input.nextDouble();

System.out.println("Enter yearly duration rate");
years = input.nextInt();
 
rate = yearlyrate / 100 /12 ;

month = years * 12;

sumrate = rate + 1;
sumrate1 = Math.pow(sumrate , month);
sumrate2 = sumrate1 * rate;
sumrate3 = sumrate1 - 1;

monthlyrate = (principal * sumrate2)   / sumrate3;

System.out.print("monthly rate is " + "$"  + monthlyrate);
 















}
}





