import java.util.*;

public class array {
	// Simple program to generate an ever-growing list of multiples (multiplication array) of a base number
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base number (integer): ");
		if (!sc.hasNextInt()) {
			System.out.println("Invalid input.");
			return;
		}
		int base = sc.nextInt();
		System.out.println("Generating multiples of " + base + ". Press Ctrl+C to stop.");

		List<Long> multiples = new ArrayList<>();
		long k = 1;
		while (true) {
			long val = base * k;
			multiples.add(val);
			System.out.println(base + " x " + k + " = " + val);
			k++;
			// small pause so output is readable
			Thread.sleep(100);
		}
	}
}



