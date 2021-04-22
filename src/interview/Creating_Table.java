package interview;

public class Creating_Table {
	void recursive(int i,int j){
		if(j>10)
			return;
		System.out.println(i+" * "+j+" = "+j*i);
		recursive(i, j+1);
	}
	public static void main(String[] args) {
		Creating_Table c=new Creating_Table();
		c.recursive(3,1);
		
		
	}

}
















//2*1=2
//2*10=20