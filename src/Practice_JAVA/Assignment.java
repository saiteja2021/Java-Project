package Practice_JAVA;

public class Assignment {

	public static void main(String[] args) {

		char c[]= {'s','a','i'};
		String sai=c.toString();
		System.out.println(sai);
		String s[]=new String[4];
		s[0]="aaa";
		s[1]="bbb";
		s[2]="ccc";
		s[3]="ddd";
		s[4]="eee";
		String s1[]=new String [3];
		String s2[]=new String [2];

	int ii=0;
	int jj=0;
	for (int i=0;i<s.length;i++) {
	if(i%2==0) {
		s1[ii++]=s[i];
		System.out.println("even strings are"+" "+s1[ii]);
	}
	
	else {
		s2[jj++]=s[i];

		System.out.println("odd strings are"+" "+s2[jj]);
	

	}

}

}
}