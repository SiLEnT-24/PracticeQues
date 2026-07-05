@FunctionalInterface
interface Addition{
	void add();
}
public class LambdaEx1 {
	public static void main(String[] args) {

		Addition a=()->{
			int x=10,y=20,r=x+y;
			System.out.println("Sum: "+r);
		};
		
		a.add();
		a.add();
		a.add();
		
		Addition aa=()->{ System.out.println("CodersLoom"); };
		aa.add();
		
	}
}