package lesson_two.online;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
	 1. Есть строка вида:
	 "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";
	 (другими словами матрица 4x4)
	 1 3 1 2
	 2 3 2 2
	 5 6 7 1
	 3 3 1 0
	 Написать метод, на вход которого подаётся такая строка,
	 метод должен преобразовать строку в двумерный массив
	 типа String[][];

	 2. Преобразовать все элементы массива в числа типа int,
	 просуммировать, поделить полученную сумму на 2,
	 и вернуть результат;

	 3. Ваш метод должен бросить исключения в случаях:
	    Если размер матрицы, полученной из строки, не равен 4x4;
	    Если в одной из ячеек полученной матрицы не число;
	    (например символ или слово)
	 4. В методе main необходимо вызвать полученный метод,
	 обработать возможные исключения и вывести результат расчета.

* */

public class MainClass {

    private class MyClass {

    }
//JRE:
// main -> MainClass.main(null) -> methodA(5, 0) -> sout
//   <-             <-                <- AE
//  |
//  v
// err -> ExceptionHandler ->....

    private static void methodA() {
        // cannot open but try to close
        // exception while closing
        try {
            open();
            // a lot of code!
            readSomething();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                close();
            } catch (NullPointerException e) {

            } catch (RuntimeException e) {

            }
        }

        try (FileInputStream fis = new FileInputStream("")) {

        } catch (FileNotFoundException f) {

        } catch (IOException e) {

        }

    }

    private static void open() throws FileNotFoundException {
        System.out.println("i open");
        //throw new FileNotFoundException();
    }

    private static void close() {
        System.out.println("I close!");
        throw new RuntimeException("very bad thing");
    }

    private static void readSomething() throws IOException {
        // do something good
        System.out.println("i read");
        //throw new IOException("i break everything");
        // do something good
    }

    public static void main(String[] args) {

        methodA();
        System.out.println("main finished");


//        int a = 10;
//
//        class UberClass implements MouseListener {
//            final int b = 10;
//            @Override
//            public void mouseUp() { }
//
//            @Override
//            public void mouseDown() { }
//        }
//
//        UberClass u = new UberClass();
//        u.mouseDown();
//        method(u);
//        method(new MouseListener() {
//            @Override
//            public void mouseUp() {
//
//            }
//
//            @Override
//            public void mouseDown() {
//
//            }
//        });
//
//        InterfaceA h = new Human();
//
//        InterfaceB[] arr = {new Human(), new Monkey()};
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] instanceof Human) {
//                ((InterfaceA) arr[i]).speak();
//            }
//        }
    }
}
