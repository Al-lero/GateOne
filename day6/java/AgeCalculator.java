import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {

	public static int calculateAge(String dateOfBirthStr) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr , formatter);

		LocalDate today = LocalDate.now();

		Period period = Period.between(dateOfBirth, today);

		return period.getYears();

	} 


}