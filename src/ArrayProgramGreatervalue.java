
public class ArrayProgramGreatervalue {
static int greater=0;
	public static void main(String[] args) {
		int[]a = { 80, 20, 40, 10, 55 };
		int total = 0;
		
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		System.out.println(total);
		for (int i = 0; i<a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] <a[j]) {
	greater=a[j];
				}

			}

		}
		System.out.println(greater);
	}
}