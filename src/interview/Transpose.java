package interview;

public class Transpose {

	public static void main(String[] args) {
int arr[][]= {{1,2,3},{5,6,7},{9,10,11}};
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr.length;j++) {
		System.out.print(arr[j][i]+ " ");
	
	}
	System.out.println();
}
	}

}
