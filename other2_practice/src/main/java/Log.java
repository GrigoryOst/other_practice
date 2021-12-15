import java.io.FileOutputStream;
import java.io.PrintStream;

public class Log {

    private static PrintStream out = System.out;

    public static void main(String[] args) {

        try {// пример вывода в файл
            PrintStream errOut = new PrintStream(new FileOutputStream("Error.log"));
            System.setErr(errOut);

            PrintStream sysOut = new PrintStream(new FileOutputStream("Debug.log"));
            System.setOut(sysOut);
        } catch (Exception e) {}

        System.out.println("message about normal working");
        System.err.println("message about error");

        for (int i = 0; i < args.length; i++) { //простая программа с параметрами
            System.out.println(args[i]);
        }
        System.out.println("Bye bye");

        if (args.length == 0) { //выход из программы
            System.out.println("Need args");
            System.exit(1);
        }
        //остальная часть программы опущена
        System.exit(0);

        //пример краткой записи вывода на экран

    }
}
