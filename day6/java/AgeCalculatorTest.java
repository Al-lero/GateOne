import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; 

public class AgeCalculatorTest {

	@Test
	public void testThatCalculateDateOfBirthIntoAge() {

	int age = AgeCalulator.calculateAge("2-06-2000");

	int expectedAge = 24;

	assertEquals(expectedAge, age);


	}
}