
public class LeapYearTernary {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter year:");
		int year = sc.nextInt();

		System.out.println(
				((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
						? "Leap Year"
						: "Not Leap Year");

		sc.close();
	}
}