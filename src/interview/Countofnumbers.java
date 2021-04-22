package interview;

public class Countofnumbers {

	public static void main(String[] args) {
		int count = 0;
		System.out.println(5%10);
		for (int i = 1; i <= 200; i++) {
			if (i % 5 == 0) {
				System.out.println(i);

				count++;
			}

		}
		System.out.println("count is"+count);

	}

}


