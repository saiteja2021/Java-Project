package interview;

public class Wordsreverse {

	public void reverse(String s4) {
		String s5="";
for(int i=s4.length()-1;i>=0;i--) {
	s5=s5+s4.charAt(i);
}
System.out.print(s5);
System.out.println();
	}

	public static void main(String[] args) {
		Wordsreverse r = new Wordsreverse();
String s3=" ";
		String s2 = "sai teja tambale from hyderabad123";

		for (int i = s2.length() - 1; i >= 0; i--) {
			s3 = s3 + s2.charAt(i);

		}
		//r.reverse(s3);
		System.out.println(s3);

	}

}


//