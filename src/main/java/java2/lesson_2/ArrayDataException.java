package java2.lesson_2;

public class ArrayDataException {
    public static void main() {
        ArrayDataException main2 = new ArrayDataException();
        main2.StringToInt(Array.correct);
        main2.StringToInt(Array.incorrect);
        main2.StringToInt(Array.incorrect2);

    }
    public void StringToInt(String[][] arr2) {
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr2[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i + 1, j + 1);
                }
            }
        }
        System.out.println("Сумма массива:" + sum);
    }

    static class myArrayDataException extends NumberFormatException {
        myArrayDataException(int row, int col) {
            super(String.format("Неправильное значение в %d строке, %d колонке", row, col));
        }
    }
    static class MyArrayDataException extends NumberFormatException {
        MyArrayDataException(int row, int col) {
            super(String.format("Неправильное значение в %d строке, %d колонке", row, col));
        }
    }
}
