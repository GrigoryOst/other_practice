public class ExplicitCast {
    //пример приведения типов
    public static void main(String[] args) {
        long l = 10;
        double d = l; //неявное (long в double)

        l = (long) d; //явное (double в long)
    }
}
