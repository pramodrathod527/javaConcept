package basic_java;

public class Object_creation {
	
	int x = 10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object_creation obj1 = new Object_creation();
		
//		System.out.println(obj1.x);   //10
		
		Object_creation obj2 = new Object_creation();
		
		obj2.x = 50;    //50
		
//		System.out.println(obj2.x);
		
		Object_creation obj3 = obj2; // here we are assigning value of obj2 in obj3
		
		System.out.println(obj3.x);
		
		
		Object_creation track = new Object_creation();
		
		track.artist = "Lata Mangeshkar";
		track.title = "Vande Mataram";
		
		
		track.play();
		
		
		
		
		
		

	}
	
	String artist;
	String title;
	
	void play() {
		System.out.println(artist + " is singing " + title);
	}
	
	
	
	

}
