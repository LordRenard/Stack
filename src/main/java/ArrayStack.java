class ArrayStack<T> implements Stack<T> {
    private int mSize; //mSize - максимальныый размер массива
    private T[] stackArray; // массив
    private int headIndex;

    public ArrayStack(int m) {
        mSize = m;
        stackArray = (T[]) new Object[mSize];
        headIndex = -1;
    }

    // метод добавляющий верхнее значение в массив
    public void push(T element) {
        if (headIndex == mSize - 1) {
            mSize = mSize * 2;
            T[] resizedArray = (T[]) new Object[mSize];
            for (int i = 0; i < stackArray.length; i++) {
                resizedArray[i] = stackArray[i];
            }
            stackArray = resizedArray;
        }
        stackArray[++headIndex] = element;

    }

    // метод удаляющий верхнее значение массива
    public T pop() {
        return isEmpty() ? null : stackArray[headIndex--];
    }

    // метод проверки верхнего значения массива
    public T peek() {
        return isEmpty() ? null : stackArray[headIndex];
    }

    // метод проверяющий является ли массив пустным
    public boolean isEmpty() {
        return (headIndex == -1);
    }

    // метод проверяющий является ли массив заполненым
    public boolean isFull() {
        return (headIndex == mSize - 1);
    }
}