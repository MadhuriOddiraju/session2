import java.time.LocalDate;
import java.time.*;

public class FutureDate {

	public static void main(String[] args) {
		LocalDate localClockRef = LocalDate.now(Clock.systemUTC());
		LocalDate localClockRef1 = LocalDate.of(2021, 12, 10);

		if (localClockRef1.isAfter(localClockRef)) {
			System.out.println(localClockRef1 + " is in future :");
		} else {
			System.out.println(localClockRef1 + " is in past: ");
		}
	}
}