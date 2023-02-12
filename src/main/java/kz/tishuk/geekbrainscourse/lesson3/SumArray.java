package kz.tishuk.geekbrainscourse.lesson3;

public class SumArray {

    public static int sumArray (String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4){
            throw new MyArraySizeException();
        }
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].length != 4){
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[0].length; j++) {
                int number;
                try {
                    number = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("В ячейке " + "[" + i + "]" + "[" + j+ "]" + " не верный формат");
                    throw new MyArrayDataException();
                }
                sum += number;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        String[][] nums = new String[][]
                {
                        {"1", "2", "3", "4"},
                        {"5", "6", "7е", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}
                };
        System.out.println("Размерность массива " + nums.length + ", " + nums[0].length);

        try {
            System.out.println("Сумма элементов массива равна " + sumArray(nums));
        } catch (MyException e) {
            System.out.println(e);
        }


    }
}
