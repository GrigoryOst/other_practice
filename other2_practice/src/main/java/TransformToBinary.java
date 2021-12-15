public class TransformToBinary { //преобразование числа в двоичную, восмиричную, шестнадцатеричную форму
    public static void main(String[] args) {
        int number = 63;
        String s;

        number = Integer.parseInt("111111", 2); //63
        s = Integer.toString(number, 2); //111111 в двоичной
        System.out.println(number + "\n" + s + "\n");

        number = Integer.parseInt("77", 8); //63
        s = Integer.toString(number, 8); //77 в восьмеричной
        System.out.println(number + "\n" + s + "\n");

        number = Integer.parseInt("63"); //63
        s = Integer.toString(number); //63 в десятичной
        System.out.println(number + "\n" + s + "\n");

        number = Integer.parseInt("3F", 16); //63
        s = Integer.toString(number, 16); //3F в шестнадцатиричной
        System.out.println(number + "\n" + s + "\n");
    }
}
