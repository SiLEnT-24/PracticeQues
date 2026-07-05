
public class LargestThreeNested {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("Largest = " + a);
			} else {
				System.out.println("Largest = " + c);
			}
		} else {
			if (b > c) {
				System.out.println("Largest = " + b);
			} else {
				System.out.println("Largest = " + c);
			}
		}

		sc.close();
	}
}