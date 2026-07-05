interface Human{
	void eat();
}
interface Student extends Human{
	void study();
}
class SchoolStudent implements Student{

	public void study() {
		System.out.println("School Student Study");
	}

	public void eat() {
		System.out.println("School Student Eat");
	}
	public void kuchbhi() {
		System.out.println("Kuch bhiiiii");
	}
}
public class InterfaceToInterfaceInheritanceEx {
	public static void main(String[] args) {
		SchoolStudent s=new SchoolStudent();
		s.eat();
		s.study();
		s.kuchbhi();
		Student s1=new SchoolStudent();
		s1.eat();
		s1.study();

		Human h=new SchoolStudent();
		h.eat();
	}
}