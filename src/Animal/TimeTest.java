package Animal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeTest {
	public static void main(String[] args) {
		long startTS =
		System.currentTimeMillis();
		System.out.println(startTS);
		double d=Math.sqrt(9);
		long endTS =
		System.currentTimeMillis();
		System.out.println("It takes " +
		(endTS - startTS) + " milliseconds");
//
//				DateTimeFormatter df2 = DateTimeFormatter
//				.ofPattern("d MMM yyyy hh:mm");
//				LocalDateTime dt = LocalDateTime
//						.parse("6 Jan 2020 03:54", df2);
//				System.out.println(dt);
		DateTimeFormatter df1 = DateTimeFormatter
				.ofPattern("d MMM yyyy h:mm a");
				LocalDateTime dt = LocalDateTime
				.parse("6 Jan 2020 3:54 PM", df1);
//				DateTimeFormatter df2 = DateTimeFormatter
//				.ofPattern("dd/MM/yyyy HH:mm");
				System.out.println(dt);
				
				
				DateTimeFormatter df3 = DateTimeFormatter
						.ofPattern("dd/MM/yy");
						LocalDate date = LocalDate
						.parse("01/02/03", df3);
						System.out.println( date);



		}

}

