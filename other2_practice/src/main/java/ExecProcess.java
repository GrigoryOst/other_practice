import java.io.IOException;

public class ExecProcess {
    public static void main(String[] args) {
        /*try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException ioe) {
            //ioe.printStackTrace();
            System.out.println("That file not yet");
        }*/

        try {
            int a[] = new int[4];
            a[5] = 6;
        } catch (ArrayIndexOutOfBoundsException t) {
            System.err.println("Exception: " + t.getMessage());
            t.printStackTrace();
        }

    }
}
