package interview;

public class StringInterviewprogram {

	public static void main(String[] args) {

		/*
		 * String str="india123is456wonderful"; String
		 * newString=str.replaceAll("\\d",""); System.out.println(str);
		 * System.out.println(newString); }
		 */

		String str = "india123is456wonderful";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 48 && str.charAt(i)<=57);
				

			else {

				str2 = str2 + str.charAt(i);

			}


		}
		System.out.println(str2);

	}
}