package basic_java;



class A{
	public void test() {
		System.out.println("hii");
	}
	
	
}
	
	
	class B extends A {
		public void test(int i) {
			System.out.println("hello "+i);
		}
		
	}
	
	


public class Testing {
	

	public static void main(String[] args) {
		
		 B obj = new B();
		obj.test(5);
		

	}

}
