
public class AutoboxTest {
	
	//Autobox
	static int test = 65;
	static Integer test_autobox = new Integer(test);
	
     

	public static void main(String[] args) {
		
		//Unbox
		Float val = new Float(25136.57);
		float test_unbox = val;
		
		float val2 = 65;
		Float val2_wrap = new Float(val2);
		Float val2_cmp = new Float(65);
		
		// TODO Auto-generated method stub
		System.out.println("Test Autobox: " +test_autobox);
		
		System.out.println("Test UnBox: " +test_unbox);
		
		System.out.println("Print as String :" +test_autobox.toString());

//		if (val2 == val2_wrap)
		if (val2_wrap.equals(val2_cmp))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		
	}

}
