
public class GreatestThree {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("Greatest = " + a);
		} else if (b > c) {
			System.out.println("Greatest = " + b);
		} else {
			System.out.println("Greatest = " + c);
		}

		sc.close();
	}
}