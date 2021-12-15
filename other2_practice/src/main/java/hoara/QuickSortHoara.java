package hoara;

public class QuickSortHoara {
    static void sort (char items[]) {
        quicksort (items, 0, items.length - 1);

    }

    private static void quicksort(char[] items, int left, int right) {
        int top, bottom;
        char comparand, value;

        top = left;//первая позиция
        bottom = right;//последняя позиция
        //выбор компаранда - символ из серидины массива
        comparand = items[((left + right) / 2)];

        //разделение последовательности на две части
        do {
            while ((items[top] < comparand) && (top < right)) top++;
            while ((comparand < items[bottom]) && (bottom > left)) bottom--;

            if (top <= bottom) {
                value = items[top];
                items[top] = items[bottom];
                items[bottom] = value;
                top++;
                bottom--;
            }
        } while (top <= bottom);
       //если закоментированный код включить в программу то бцдет виден промежуточный результат сортировка
       /* if (((right + 1) - left) == items.length) {
            for (int i = 0; i < items.length; i++); {
                System.out.println(items);
                System.out.println();
            }
        }*/

        //рукурсивная сортировка первой части
        if (left < bottom) quicksort(items, left, bottom);
        //рукурсивная сортировка второй части
        if (top < right) quicksort(items, top, right);
    }
}

