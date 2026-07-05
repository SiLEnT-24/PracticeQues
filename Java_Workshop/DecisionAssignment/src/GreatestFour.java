
public class GreatestFour {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter four numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		if (c > max) {
			max = c;
		}

		if (d > max) {
			max = d;
		}

		System.out.println("Greatest = " + max);

		sc.close();
	}
}