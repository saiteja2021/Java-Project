
class AA {
	void m1(int a) {
		System.out.println(" in m1 method in base class");
		System.out.println("value is " +a*10);

	}
}

class BB extends AA {
	void m1(int b) {
		System.out.println(" in m1 method in child class");
		System.out.println("value is " +b/2);
	}
}

public class OVerridingProgram {
	public static void main(String[] args) {
		BB a = new BB();
		a.m1(6);
	}
}

