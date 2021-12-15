import java.util.GregorianCalendar;

public class LeapYearDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        for (int year = 1990; year <= 2030; year++) {
            if (gc.isLeapYear(year)) {
                System.out.println("Год " + year + " високосный");
            }
        }
    }
}
