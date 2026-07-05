class AAA{
	
	final int x=10; 
	final static int y=10; 
	void m() {
		System.out.println(x);
		System.out.println(y);
		final int z=30; 
		System.out.println(z);
		int k;
	}
	void mm() {

	}
}
public class FinalVariableEx {
	public static void main(String[] args) {
		AAA a=new AAA();

		System.out.println(a.x);
		System.out.println(AAA.y);
		a.m();

	}
}