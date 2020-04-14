package pkg_1;

import java.time.LocalTime;

public class Time_Add_Subtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // LocalTime t1 = LocalTime.now().plus(5, ChronoUnit.MINUTES);
		
		// LocalTime t2 = LocalTime.now().plusMinutes(90);
		
		LocalTime t3 = LocalTime.now().minusHours(24);
		
		System.out.println(t3);

	}

}
