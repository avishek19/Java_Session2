
public class PassValue {
	
	static final int FILE_OPEN = 1;
	
	static void vaTest( int v[]) {
		System.out.println("Number of args: " +v.length + "Contents :");
	
		
    for (int x : v) 
    	System.out.println(x + " ");
    }
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[10];
		int b[] = {12,34,121,88};
		
		
		vaTest(a);
		vaTest(b);
	}

}
