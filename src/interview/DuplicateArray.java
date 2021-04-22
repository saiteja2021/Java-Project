package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
int arr[]= {11,10,2,10,20,11,55,75,54,33,21,33};
String s="saiteja";
int c[]= {'a','b'};
System.out.println(c);

System.out.println(s);
System.out.println(arr);
Set<Integer>ll=new LinkedHashSet<Integer>();
for(int i=0;i<arr.length;i++) {
ll.add(arr[i]);
}
System.out.println(ll);
List l=new ArrayList(ll);
System.out.println(l.get(3));
}
}