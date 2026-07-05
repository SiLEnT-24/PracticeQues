
public class LeapYear {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter year:");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}

		sc.close();
	}
}