package pkg_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date_Add_Subtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        LocalDate d1 = LocalDate.now().plus(10, ChronoUnit.DECADES);
		
		System.out.println(d1);

	}

}
