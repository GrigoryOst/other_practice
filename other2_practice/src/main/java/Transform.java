public class Transform { //преобразование целого числа в строку и обратно
    public static void main(String[] args) {
        StringInt();
        IntString();
    }

    public static void StringInt() {
        //преобразование строки в целое число
        String stringValue = "101";
        int intValue = Integer.parseInt(stringValue); //извлечение числа из строки
        System.out.println(intValue);
    }

    public static void IntString() {
        //преобразование целого числа в строку
        int intValue = 101;
        String stringValue = Integer.toString(intValue); //вставка числа в строку
        System.out.println(stringValue);
    }
}
