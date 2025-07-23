package oops;
import java.util.Scanner;
public class fahrenhiet_to_celsius {
	public static void main(String[] args) {
float fahrenheit;
double celsius;
System.out.println("Enter temp in fahrenheit: ");
Scanner sc = new Scanner(System.in);
fahrenheit=sc.nextInt();
celsius = (fahrenheit-32)*5.0/9.0;
System.out.println("conversion: " +celsius);
	}
}
