package Practice_JAVA;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
Employee e1=new Employee("sai",22);
Employee e2=new Employee("teja",33);
Employee e3=new Employee("tambale",44);

ArrayList <Employee>l=new ArrayList<Employee>();
l.add(e1);
l.add(e2);
l.add(e3);
for(Employee ll:l) {
System.out.println(ll.s);
System.out.println(ll.i);

}
ArrayList<Employee> l2=new ArrayList<Employee>();
l2.addAll(l);
for(Employee l3:l2) {
	System.out.println(l3.s);
	//System.out.println(l3.i);
}
	}

}
