package com.sai.javainterviewprograms;

class A{

	
	void display(int a,int b) {
		System.out.println("in display method of parent class");
	}
}
class B extends A{
	
	void display(float a ,float b) {
		System.out.println("in display method of child class");

	}
	
	
	
	
}
public class OverloadingProgram{
	public static void main(String[] args) {
		
	
	B b=new B();
	b.display(3,5);
	b.display(5f,7f);
}
}