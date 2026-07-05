@FunctionalInterface
interface Sum{
	void add(int x,int y);
}
public class LambdaEx2 {
	public static void main(String[] args) {

		Sum a=(m, n)->{
			int r=m+n;
			System.out.println("Sum: "+r);
		};
		
		a.add(9,8);
		a.add(78,58);
		a.add(19,80);
	}
}