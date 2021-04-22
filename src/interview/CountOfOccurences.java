package interview;

import java.util.*;

public class CountOfOccurences {
	/*HashMap <Character, Integer> hashMap = new HashMap<>();
	for (int i = myStr.length() - 1; i >= 0; i--) {
	   if (hashMap.containsKey(myStr.charAt(i))) {
	      int count = hashMap.get(myStr.charAt(i));
	      hashMap.put(myStr.charAt(i), ++count);
	   } else {
	         hashMap.put(myStr.charAt(i),1);
	   }
	}
*/
	
	
	
	public static void countFreq(int arr[], int n)
    {
        Map<Integer, Integer> mp = new HashMap<Integer,Integer>();
  
        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i])) 
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } 
            else
            {
                mp.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
  
    public static void main(String args[]) 
    {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        countFreq(arr, n);
    }
	
	
}
