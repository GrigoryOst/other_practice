public class Factorial {

    // пример статических методов
    static long computeI (int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static long computeJ (int n) {
        if (n == 1) return n;
        return computeJ(n - 1) * n;
    }

    public static void main(String[] args) {


        System.out.println("вычисление факториала в цикле");
        for (int i = 6; i > 0; i--) {
            System.out.println(i + "! = " + Factorial.computeI(i));
        }

        System.out.println("вычисление факториала рекурсивным методом");
        for (int j = 1; j <= 6; j++) {
            System.out.println(j + "! = " + Factorial.computeJ(j));
        }

    }

}
