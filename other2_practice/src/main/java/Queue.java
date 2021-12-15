public class Queue {
    private char q[];
    private int putloc;
    private int getloc;

    //создание пустой очереди
    Queue (int size) {
        q = new char[size + 1]; //резервирование памяти
        getloc = putloc = 0;
    }

    //создание очереди из другой очереди
    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        //копирование элементов из предыдущей очереди
        System.arraycopy(ob.q, 0, q, 0, ob.q.length);
    }

    //создание очереди из массива
    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];

        //копирование элементов  символьного массива в очередь
        for (int i = 0; i < a.length; i++) put (a[i]);
    }

    //проверка переполнения очереди
    boolean isFull() {
        return (putloc == (q.length) - 1);
    }

    //проверка пустоты очереди
    boolean isEmpty() {
        return (getloc == putloc);
    }

    //добавление символа в очередь
    void put (char ch) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        putloc++;
        q[putloc] = ch;
    }

    //извлечение символа из очереди
    char get() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Fronta je pz6zdn6.");
        }
        getloc++;
        return q[getloc];
    }





}
