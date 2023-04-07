class ArrayStack<T> implements Stack<T> {
    private int mSize; //mSize - ������������� ������ �������
    private T[] stackArray; // ������
    private int headIndex;

    public ArrayStack(int m) {
        mSize = m;
        stackArray = (T[]) new Object[mSize];
        headIndex = -1;
    }

    // ����� ����������� ������� �������� � ������
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

    // ����� ��������� ������� �������� �������
    public T pop() {
        return isEmpty() ? null : stackArray[headIndex--];
    }

    // ����� �������� �������� �������� �������
    public T peek() {
        return isEmpty() ? null : stackArray[headIndex];
    }

    // ����� ����������� �������� �� ������ �������
    public boolean isEmpty() {
        return (headIndex == -1);
    }

    // ����� ����������� �������� �� ������ ����������
    public boolean isFull() {
        return (headIndex == mSize - 1);
    }
}