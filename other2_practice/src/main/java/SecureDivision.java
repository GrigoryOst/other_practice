public class SecureDivision {

    public static void main(String[] args) {
        // пример защиты деления на 0
        int resulti;
        for (int divisor = -5; divisor <= 5; divisor++) {
            resulti = divisor != 0 ? 100 / divisor : 0;
            if (resulti != 0) {
                System.out.println("100 / " + divisor + " = " + resulti);
            }
        }
    }
}
