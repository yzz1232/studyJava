package studyJava.java8.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date1 {
	
	public static void main(String[] args) {
		
		LocalDate nowDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now:" + nowDate + " " + nowTime);
		System.out.println("now:" + now);
		
		LocalDate birthday = LocalDate.of(2018, 12, 22);
		System.out.println("my birthday is:"+ birthday.getDayOfWeek());
		
		Instant insant = Instant.now();
		System.out.println("time:"+insant.getEpochSecond());
		System.out.println("time:"+insant.getNano());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(now.format(formatter));
		
		
	}
	
}
