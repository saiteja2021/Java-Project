package Practice_JAVA;

public class AbstractConcept2 extends AbstractConcept1 {

	@Override
	public void m1() {
		System.out.println("method has been overridden");

	}

	public void debit() {
		System.out.println("debit card charges 200 rs");
	}

	public void credit() {
		System.out.println("credit card charges 500 rs");

	}
}
