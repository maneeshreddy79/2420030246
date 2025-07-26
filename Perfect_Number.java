package oops;
import java.util.Scanner;
public class Perfect_Number {

	public static void main(String[] args) {
		int n,i;
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int sum=0;
		for(i=1;i<n;i++) {
			if(n%i==0 && i!=n) {
				sum=sum+i;
				
			}
		}
		if(n==sum) {
System.out.println("It is a perfect Number");
		}
		else {
			System.out.println("It is not a perfect Number");
		}
	}

}
