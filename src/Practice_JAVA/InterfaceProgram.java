package Practice_JAVA;

import java.util.ArrayList;
import java.util.List;

/*interface A {
 void m1() ;
 void a1();
 abstract class ChromeDriver implements A{
	 
 }
}
public class InterfaceProgram implements A{
	public void m1() {
		System.out.println("in m1 method");
	}
	public void a1() {
		System.out.println("in a1 method");

	}
	
	
	public static void main(String[] args) {
		InterfaceProgram i=new InterfaceProgram();
		i.m1();
		i.a1();
	}
	
	
}*/

interface A{
	void m1();
}
interface B{
	void m1();
}

interface c extends A,B{
}


