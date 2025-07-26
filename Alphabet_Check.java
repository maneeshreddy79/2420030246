package oops;
import java.util.Scanner;
public class Alphabet_Check {
public static void main(String[] args) {
	System.out.println("Enter the alphabet: ");
	char n;
	Scanner sc=new Scanner(System.in);
	n=sc.next().charAt(0);
	if(n>=65 &&n<=90) {
		System.out.println("Character is an alphabet");
	}
	else if(n>=97 && n<=122) {
		System.out.println("Character is an alphabet");
	}
	else {
		System.out.println("Character is not an alphabet");
	}
}
}
