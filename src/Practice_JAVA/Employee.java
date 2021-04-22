package Practice_JAVA;

class Employee {
String s;
int i;
	Employee(String s2,int y){
		s=s2;
		i=y;
	}
void display() {
	System.out.println(i);
	System.out.println(s);
}
	


public static void main(String[] args) {
	Employee e=new Employee("sai",22);
	e.display();
	
}
}
