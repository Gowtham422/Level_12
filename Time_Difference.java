package pkg_1;

import java.time.Duration;
import java.time.LocalTime;

public class Time_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        LocalTime t1 = LocalTime.of(1, 15);
		
		Duration d = Duration.between(t1, LocalTime.now());
		
		System.out.println(d);
		
		System.out.println(d.toHours());
		System.out.println(d.toMinutes());
		

	}

}
