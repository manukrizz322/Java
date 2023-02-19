
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateChecker {
	public static boolean isEffectiveDateInRange(String effectiveDateStr, String partBEffectiveDateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
		LocalDate partBEffectiveDate = LocalDate.parse(partBEffectiveDateStr, formatter);
		LocalDate earliestDate = partBEffectiveDate.minusMonths(3).withDayOfMonth(1);
		System.out.println(earliestDate);
		LocalDate lastDate = partBEffectiveDate.plusMonths(5)
				.withDayOfMonth(partBEffectiveDate.plusMonths(5).lengthOfMonth());
		System.out.println(lastDate);
		LocalDate effectiveDate = LocalDate.parse(effectiveDateStr, formatter);
		return effectiveDate.isAfter(earliestDate) && effectiveDate.isBefore(lastDate)
				|| effectiveDate.isEqual(earliestDate) || effectiveDate.isEqual(lastDate);
	}
	
	public static void main(String[] args) {
		
		System.out.println(isEffectiveDateInRange("01/01/23","05/02/23"));
		
	}
}
