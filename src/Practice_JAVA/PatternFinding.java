package Practice_JAVA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class PatternFinding {

	public static void main(String[] args) {
String s="saitejasaitejabhaiayesaikepas";
int count =0;
Pattern p=Pattern.compile("sai");
Matcher m=p.matcher(s);
while(m.find()) {
count++;	
}
System.out.println(count);
	}

}
