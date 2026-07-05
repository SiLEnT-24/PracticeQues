
public class ForLoopEx7 {
	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i; 
		}
		System.out.println("Result: "+sum);
		
		sc.close();
	}
}
