package basic_java;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		
		 SimpleDateFormat formate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
		    Date date = new Date();  
		    
		    String current_date = formate.format(date);
		    System.out.println(current_date);  
		
	

		
	}

}
