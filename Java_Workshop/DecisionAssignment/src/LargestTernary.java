
public class LargestTernary {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

		System.out.println("Largest = " + max);

		sc.close();
	}
}