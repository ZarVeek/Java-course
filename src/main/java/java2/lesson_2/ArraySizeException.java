package java2.lesson_2;

public class ArraySizeException {

    public static void main() {
        ArraySizeException main = new ArraySizeException();
        try {
            main.stringExceptionTest(Array.correct);
            main.stringExceptionTest(Array.incorrect);
            main.stringExceptionTest(Array.incorrect2);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public void stringExceptionTest(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException(String.format("Неверное количество столбцов в %d-й" +
                    " строке", i));
        }
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

