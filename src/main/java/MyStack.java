public class MyStack {
    public static void main (String [] args) {
        ArrayStack<Integer> newStack = new ArrayStack<>(10);    // создание массива-стека

        for (int i = 0; i <= 2000; i++) {
            newStack.push(i);   // добавление эллемонтов в стек
        }

        //newStack.pop();   // удаление верхнего значени€ в стеке

        System.out.print("—тек: ");
        while (!newStack.isEmpty()) { // цикл извлекающий элементы стека до тех пор пока стек не €вл€етс€ пустым
            Integer value = newStack.pop();
            System.out.println(value);
            //System.out.print(" "); // переметр value удал€ет элементы массива и выводит их на экран пользовател€
        }
        System.out.println("");

    }
}
