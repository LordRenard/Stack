public class MyStack {
    public static void main (String [] args) {
        ArrayStack<Integer> newStack = new ArrayStack<>(10);    // �������� �������-�����

        for (int i = 0; i <= 2000; i++) {
            newStack.push(i);   // ���������� ���������� � ����
        }

        //newStack.pop();   // �������� �������� �������� � �����

        System.out.print("����: ");
        while (!newStack.isEmpty()) { // ���� ����������� �������� ����� �� ��� ��� ���� ���� �� �������� ������
            Integer value = newStack.pop();
            System.out.println(value);
            //System.out.print(" "); // �������� value ������� �������� ������� � ������� �� �� ����� ������������
        }
        System.out.println("");

    }
}
