import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeSimple { //пример чтения даты и времени в программе
    private Date fromDate = null;
    private SimpleDateFormat formatter = null;

    public DateTimeSimple (Date anyDate) {
        fromDate = anyDate;
        formatter = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy", Locale.getDefault());
    }

    //возвращает день
    public int getDay () {
        formatter.applyPattern("d");
        return Integer.parseInt(formatter.format(fromDate));
    }

    //возвращает месяц
    public int getMonth () {
        formatter.applyPattern("M");
        return Integer.parseInt(formatter.format(fromDate));
    }

    //возвращает год
    public int getYear () {
        formatter.applyPattern("y");
        return Integer.parseInt(formatter.format(fromDate));
    }

    //возвращает час
    public int getHour () {
        formatter.applyPattern("h");
        return Integer.parseInt(formatter.format(fromDate));
    }

    //возвращает минуты
    public int getMinute () {
        formatter.applyPattern("m");
        return Integer.parseInt(formatter.format(fromDate));
    }

    //возвращает секунды
    public int getSeconds () {
        formatter.applyPattern("s");
        return Integer.parseInt(formatter.format(fromDate));
    }
}

class DatePartTest {
    public static void main(String[] args) {
        Date currentDate = new Date();
        DateTimeSimple dp = new DateTimeSimple(currentDate);

        int year = dp.getYear();
        System.out.println("Текущий год: " + year);

        int month = dp.getMonth();
        System.out.println("Текущий месяц: " + month);

        int day = dp.getDay();
        System.out.println("Текущий день: " + day);

        int hour = dp.getHour();
        System.out.println("Текущий час: " + hour);

        int minute = dp.getMinute();
        System.out.println("Текущая минута: " + minute);

        int seconds = dp.getSeconds();
        System.out.println("Текущая секунда: " + seconds);
    }
}
