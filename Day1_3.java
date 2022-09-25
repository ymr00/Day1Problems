import java.util.Scanner;

public class Day1_3 {
	public static void main(String[] args) {
		System.out.println("Enter the first string = ");
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		System.out.println(" Entered first string is : " + string1);
		System.out.println("Enter the second string = ");
		String string2 = sc.nextLine();
		System.out.println(" Entered second string is : " + string2);
		
		System.out.println("\nAre both strings equal : ");
		
		if (string1.equals(string2) == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
