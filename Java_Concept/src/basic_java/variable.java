package basic_java;

public class variable {
	
	int x = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = 11;
		
		System.out.println(y); // 11
		
		//System.out.println(x); // Error: we cannot directly print instance variable (non static to static ) we have to create object for that
		
		
//		object : the memory in the RAM which is reserved for the non-static elements of
//		the dot class file is known as Object in java.

		 variable obj = new variable();
		 
		System.out.println(obj.x);

	}

}
