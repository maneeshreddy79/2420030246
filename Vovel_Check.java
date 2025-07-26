package oops;
import java.util.Scanner;
public class Vovel_Check {

	public static void main(String[] args) {
		char n;
		System.out.println("Enter the alphabet: ");
		Scanner sc=new Scanner(System.in);
		n= sc.next().charAt(0);
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U') {
			System.out.println("alphabet is a  vovel");
		}
		else {
			System.out.println("alphabet is not a vovel");
		}

	}

}
