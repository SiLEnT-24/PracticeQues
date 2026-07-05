class Employeees{
	String name;
	int salary;
	String cname;
}

public class ClassObjectEx1 {

	public static void main(String[] args) {
		//Student a=new Employee();//error
		Employeees a=new Employeees();
		Employeees b=new Employeees();
		Employeees c=new Employeees();
		Employeees d=new Employeees();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//System.out.println(name); //error
		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		
		a.name="Kaliya";
		a.salary=213456;
		a.cname="ABC";
		
		b.name="Yoyo";
		b.salary=24513456;
		b.cname="XYZ";
		
		c.name="Teja";
		c.salary=213987456;
		c.cname="ASD";
		
		d.name="Bheem";
		d.salary=9876532;
		d.cname="GFD";
		
		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total Salary: "+total);
		
	}
}