import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class JavaDatesApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		LocalDate ld = LocalDate.now();
		System.out.println("LocalDate = " + ld);
		LocalTime lt = LocalTime.now();
		System.out.println("Localtime = " + lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("LocalDateTime = " + ldt);
		System.out.println("\nParse Examples");
		LocalDate ld1 = LocalDate.parse("2018-12-25");
		System.out.println("ld1 = " + ld1);
		System.out.println("\nOf examples");
		
		LocalDate ld2 = LocalDate.of(2018,12, 31);
		System.out.println("ld2 = " + ld2);
		
		System.out.println("ld2: " + ld2.getDayOfMonth());
		
		System.out.println("\nComparison Methods");
		System.out.println("Christmas before New Years?: " + ld1.isBefore(ld2));
		System.out.println("Compare Christmas to New Years: "+ld1.compareTo(ld2));
		
		// DateTime Format Examples
		System.out.println("\nDateTimeFormatter Examples");
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println("formatted Christmas: " + formatter.format(ld1));
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("formatted Christmas = " + formatter2.format(ld1));
		
		LocalDate date = LocalDate.of(2018, 12, 19);
		System.out.println("Las Vegas Trip Departure Date: " + date);
		
		// adjusters P.448-449
		LocalDate newDate = date.withDayOfMonth(27);
		System.out.println("New Las Vegas Trip Departure Date: " + newDate+ "\n");
		
		// get time between two dates or time
		long numberDays = ChronoUnit.DAYS.between(date, newDate);
		System.out.println("Days Between Old and New Vacation Date: " + numberDays);
		
		LocalDate newYear1976 = LocalDate.of(1976, Month.JANUARY, 1);
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(dtf.format(newYear1976));
	}

}
