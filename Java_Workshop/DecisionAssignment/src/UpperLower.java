
public class UpperLower {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter character:");
		char ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Uppercase");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase");
		}

		sc.close();
	}
}