import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class MenstrualCycleApp {
    private static final int AVERAGE_CYCLE_LENGTH = 28;
    private static final int LUTEAL_PHASE_LENGTH = 14;
    private LocalDate startDate;
    private LocalDate endDate;

    public void addCycleStart(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void addCycleEnd(LocalDate endDate) {
        this.endDate = endDate;
        //calculateCycleLength();
    }

    public void calculateCycleLength() {
        if (this.startDate != null && this.endDate != null) {
	    long cycleLength = ChronoUnit.DAYS.between(this.startDate, this.endDate);
            System.out.println("Cycle length: " + cycleLength +" days");
	    
		
        }   
 }

   public void predictNextCycle() {
        if (this.endDate != null) {
            LocalDate nextCycleStart = this.endDate.plusDays(AVERAGE_CYCLE_LENGTH);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formattedDate = nextCycleStart.format(formatter);
            System.out.println("Predicted next cycle start: " + formattedDate);
        }
    }

    public static boolean isCycleLongEnough(LocalDate startDate, LocalDate endDate, int averageCycleLengthDays) {
        long cycleLength = ChronoUnit.DAYS.between(startDate, endDate);
        return cycleLength >= averageCycleLengthDays;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenstrualCycleApp app = new MenstrualCycleApp();
	int averageCycleLength = 28;

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	String phrase = """
		A period is the part of the menstrual cycle when a woman bleeds from her vagina for a few days. For most women this happens every 28 days or so, but it's common for periods to be more or less frequent than this, ranging from every 23 days to every 35 days.
	""";
	System.out.println(phrase);
	
	String[] QuestionOne = {"A. Cramps  ", "B. Tender Breast ", "C. Bloating ", "D. Spotting ", "E. All of the above "};   
	System.out.println("Which of these do you feel during before your period? ");
	for(int count = 0; count < QuestionOne.length; count++) { 
	System.out.println(QuestionOne[count]);}
	String response = scanner.nextLine();

	String[] QuestionTwo = {"A. Cranky  ", "B. Emotional ", "C. Forgetful ", "D. Stressed ", "E. All of the above "};   
	System.out.println("How are you feeling today ? ");
	for(int count = 0; count < QuestionTwo.length; count++) { 
	System.out.println(QuestionTwo[count]);}
	String responseTwo = scanner.nextLine();

        System.out.println("Enter the date of your last period started (dd-MM-yyyy): ");
        String lastPeriodInput = scanner.nextLine();
	LocalDate lastPeriod = LocalDate.parse(lastPeriodInput, formatter);
        app.addCycleStart(lastPeriod);

	System.out.println("Enter the date when your last period ended (dd-MM-yyyy): ");
        String endPeriodInput = scanner.nextLine();
        LocalDate endPeriod = LocalDate.parse(endPeriodInput, formatter);
        app.addCycleEnd(endPeriod);

        app.calculateCycleLength();
        app.predictNextCycle();

	boolean isLongEnough = isCycleLongEnough(lastPeriod, endPeriod, averageCycleLength);
        if (isLongEnough) {
            System.out.println("The menstrual cycle is 28 days or longer.");
        } else {
            System.out.println("The menstrual cycle is shorter than 28 days.");
	}

	LocalDate nextPeriod = lastPeriod.plusDays(AVERAGE_CYCLE_LENGTH);
        LocalDate ovulationDate = nextPeriod.minusDays(LUTEAL_PHASE_LENGTH);

	LocalDate safePeriodStart = lastPeriod.plusDays(7);
        LocalDate safePeriodEnd = ovulationDate.minusDays(4);
	
	System.out.println();
	System.out.println("Safe period starts on: " + safePeriodStart.format(formatter) + " and ends on: " + safePeriodEnd.format(formatter));
	System.out.println();
	System.out.println("Your estimated ovulation date is: " + ovulationDate.format(formatter));
	System.out.println();
	System.out.println("Your next period is expected around: " + nextPeriod.format(formatter));


}
}
