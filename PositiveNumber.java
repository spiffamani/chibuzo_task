import java.util.Scanner;
public class PositiveNumber {
public static void main(String[] args ){
Scanner input = new Scanner(System.in) ;
System.out.print("Enter positive number ") ;
int number =input.nextInt();

int number1 = number ;
for (int i = 0; i <= 12 ; i++){ 
System.out.println(number1 + " * " + i  +" * " +(number1 * i ));
}
}
}