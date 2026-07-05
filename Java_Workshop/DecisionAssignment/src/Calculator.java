
public class Calculator {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter first number:");
		int a = sc.nextInt();

		System.out.println("Enter second number:");
		int b = sc.nextInt();

		System.out.println("Enter operator:");
		char op = sc.next().charAt(0);

		switch (op) {
		case '+':
			System.out.println(a + b);
			break;

		case '-':
			System.out.println(a - b);
			break;

		case '*':
			System.out.println(a * b);
			break;

		case '/':
			System.out.println(a / b);
			break;

		default:
			System.out.println("Invalid Operator");
		}

		sc.close();
	}
}