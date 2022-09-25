
public class Day1_4 {
	public static void main(String a[]) {
		int sum =0;
		int invaild =0;
		
		for (int i=0; i<a.length; i++) {
			try {
				sum += Integer.parseInt(a[i]);
			}
			catch (NumberFormatException e) {
				invaild++;
			}
		}
		System.out.println("Total no.of arguments ; " + a.length);
		System.out.println("Invalid Integers : " + invaild);
		System.out.println("Sum : " + sum);
	}

}
