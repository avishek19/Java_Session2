
public class TestInner {

	int out_x = 1500;
	
	void test() {
		System.out.println("Print Outer" );
		Inner inner = new Inner();
		inner.display();
	}
	
	
	class Inner {
		int xy = 1600;
		
		void display()
		{
			System.out.println("Display Inner:" +out_x);
		}
	}

}


class Test {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	TestInner obj1 = new TestInner();
	obj1.test();

}}
