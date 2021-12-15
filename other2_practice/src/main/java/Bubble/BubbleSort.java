package Bubble;

class BubbleSort {
    static void sort(int nums[]) {
        int t; //вспомогательная переменная
        for (int i = 1; i < nums.length; i++) { //повтор для каждого элемента массива
            for (int j = nums.length - 1; j >= i; j--) {//повтор для проверки порядка соседних элементов
                if (nums[j - 1] > nums[j]) {//перестановка эелементов
                    t = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = t;
                }
            }
        }
    }
}

class BubbleSortDemo {
    public static void main(String[] args) {
        int nums[] = {99, -10, 23, 123972, 17, -654, 46, 87, -9};
        System.out.println("исходный порядок массива: ");
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i] + " ");
        System.out.println();
        BubbleSort.sort(nums);

        System.out.println("Новый порядок");
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i] + " ");

        System.out.println();
    }
}
