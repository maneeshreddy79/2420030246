package lab_1;
import java.util.Scanner;
public class Addition_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Morning Shift Earnings : ");
		int morningShiftEarnings = sc.nextInt();
		
		System.out.print("Enter the Evening Shift Earnings : ");
		int eveningShiftEarnings = sc.nextInt();
		
		System.out.println("The total amount earned in a day : "+(morningShiftEarnings+eveningShiftEarnings));
	}

}
