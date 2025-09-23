import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		Calendar cld = Calendar.getInstance();
		cld.set(Calendar.DAY_OF_MONTH, 24);
		cld.set(Calendar.MONTH, 3);
		cld.set(Calendar.YEAR, 1978);
		cld.set(Calendar.HOUR_OF_DAY, 13);
		cld.set(Calendar.MINUTE, 30);
		cld.set(Calendar.SECOND, 55);
		Date dt = cld.getTime();
		System.out.print("Calendar Data: "+ dt);
		
		DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime date = LocalDateTime.parse("24/04/1978 15:02:03",form);
		System.out.print("\nLocal Date Time Data: "+ date);
		date = LocalDateTime.of(1458,5,21,15,04,3);
		System.out.print("\nLocal Date Time Data: "+ date);
		
		Instant data = Instant.parse("1978-04-24T15:27:21-03:00");
		System.out.print("\nInstant Data: "+ data);
		
		LocalDate pog = LocalDate.parse("1978-04-24");
		System.out.print("\nLocal Date Data: "+ pog);
		pog = LocalDate.of(1458,5,21);
		System.out.print("\nLocal Date Data: "+ pog);
	}

}
