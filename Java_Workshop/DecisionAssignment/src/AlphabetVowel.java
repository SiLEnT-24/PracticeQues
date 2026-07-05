
public class AlphabetVowel {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter character:");
		char ch = sc.next().charAt(0);

		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
					|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println("Alphabet and Vowel");
			} else {
				System.out.println("Alphabet and Consonant");
			}

		} else {
			System.out.println("Not an Alphabet");
		}

		sc.close();
	}
}