class A{
	int x=90;
	void m() {
		System.out.println("Hello A");
	}
}
public class ArrayEx8 {
	public static void main(String[] args) {
		A a[]=new A[4];
		a[0]=new A();
		a[1]=new A();
		a[2]=new A();
		a[3]=new A();
		
		A aa[]={new A(), new A(), new A(), new A()};
		
		A aaa[]=new A[4];
		for(int i=0;i<aaa.length;i++) {
			aaa[i]=new A();
		}
		
		aaa[2].m();
		aaa[2].x=900000;
		System.out.println(aaa[2].x);
		
		for(A k:aaa) {
			System.out.println(k.x);
		}
	}
}