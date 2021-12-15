package hoara;

public class QuickSortDemmo extends QuickSortHoara {
    public static void main(String[] args) {
        char seq[] = {'h', 'e', 'd', 'a', 'c', 'i'};
        System.out.println("Исходный порядок символов: ");
        for (int i = 0; i < seq.length; i++) {
            System.out.println(seq[i]);
        }
        System.out.println();
        QuickSortHoara.sort(seq);

        System.out.println("Сортированный порядок: ");
        for (int i = 0; i < seq.length; i++) {
            System.out.println(seq[i]);
        }
        System.out.println();
    }
}
