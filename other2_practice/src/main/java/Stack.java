public class Stack {
    private Object [] theArray;
    private int topOfStack;

    static final int DEFAULT_CAPACITY = 10;

    //установка объема стека по умолчанию

    public Stack() {
        theArray = new Object[DEFAULT_CAPACITY];
        topOfStack = -1;
    }

    //проверка пуст ли стек?
    //@return возвращает тру если стек пустой иначе фолс

    boolean isEmpty() {
        return topOfStack == -1;
    }

    //@return возвращает последний добаленный элемент стека, не изменяет стек

    Object top() {
        if (isEmpty()) return null;
        return theArray[topOfStack];
    }

    //извлекает элемент из стека

    void pop() {
        if (isEmpty()) return;
        topOfStack--;
    }

    //@return извлекает и возвращает элемент с вершины стека

    Object topAndPop() {
        if (isEmpty()) return null;
        return theArray[topOfStack];
    }

    //добавляет новый элемент в стек @param x - добавляемый объект

    void push(Object x) {
        if (topOfStack + 1 == theArray.length) doubleArray();
        theArray [++topOfStack] = x;
    }

    //очитска стека

    void makeEmpty() {
        topOfStack = -1;
    }

    //внутренний метод удвоения размера стека

    private void doubleArray() {
        Object[] newArray;

        newArray = new Object[theArray.length * 2];
        for (int i = 0; i < theArray.length; i++) {
            System.arraycopy(theArray, 0, newArray, 0, theArray.length);
        }

        theArray = newArray;
    }
}
