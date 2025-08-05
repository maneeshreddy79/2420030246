package Lab_3;
import java.util.*;
public class Non_Repeating_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) 
        {
            unique.add(num);
        }
        System.out.println("Unique elements:");
        for (int num : unique) 
        {
            System.out.print(num + " ");
        }
	}

}
