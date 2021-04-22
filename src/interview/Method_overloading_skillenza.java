package interview;

public class Method_overloading_skillenza {

	public void method(Object o) {
		System.out.println("in object method");
	}

	public void method(char c) {
		System.out.println("in string method");

	}

	public static void main(String[] args) {
Method_overloading_skillenza s=new Method_overloading_skillenza();
s.method('c');
}

}
