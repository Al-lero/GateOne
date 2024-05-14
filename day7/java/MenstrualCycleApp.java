import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MenstrualCycleApp {
    private static final int AVERAGE_CYCLE_LENGTH = 28;
    private static final int LUTEAL_PHASE_LENGTH = 14;
    private LocalDate startDate;
    private LocalDate endDate;

    public void addCycleStart(LocalDate startDate) {
        this.startDate = startDate;
    }