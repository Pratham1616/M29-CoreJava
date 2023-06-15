package org.tnsif.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		LocalDate obj1 = LocalDate.of(2002, 02, 02);
		System.out.println(obj1);
		
		LocalDateTime obj2 = LocalDateTime.now();
		System.out.println(obj2);
		
		LocalDate obj3 = LocalDate.now();
		System.out.println(obj3);
		
		ZonedDateTime obj4 = ZonedDateTime.now();
		System.out.println(obj4);
		
		OffsetDateTime obj5 = OffsetDateTime.now();
		System.out.println(obj5);

	}

}