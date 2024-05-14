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
        calculateCycleLength();
    }

    public void calculateCycleLength() {
        if (this.startDate != null && this.endDate != null) {
            long cycleLength = ChronoUnit.DAYS.between(this.startDate, this.endDate);
            System.out.println("Cycle length: " + cycleLength + " days");
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenstrualCycleApp app = new MenstrualCycleApp();

        System.out.println("Enter the date of your last period (dd-MM-yyyy):");
        String lastPeriodInput = scanner.nextLine();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate lastPeriod = LocalDate.parse(lastPeriodInput, formatter);
        app.addCycleStart(lastPeriod);


}
}
