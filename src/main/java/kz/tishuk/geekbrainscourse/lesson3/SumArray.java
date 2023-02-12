package kz.tishuk.geekbrainscourse.lesson3;

public class SumArray {

    public static int sumArray (String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4 || array[0].length != 4){
            throw new MyArraySizeException("Массив должен быть размером [4][4]");
        }
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++) {
                int number = 0;
                try {
                    number = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не возможно преобразовать в число");
                }
                sum = sum + number;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] nums = new String[][]
                {
                        {"1", "2", "3", "4"},
                        {"5", "6", "7е", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}
                };
        System.out.println("Размерность массива " + nums.length + ", " + nums[0].length);

        System.out.println("Сумма элементов массива равна " + sumArray(nums));


    }
}
