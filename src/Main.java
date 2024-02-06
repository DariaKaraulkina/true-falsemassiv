import java.util.Arrays;

/*Задан массив целых чисел,в котором содержатся числа от 1 до 100.
В этом массиве есть один и только один продублированный элемент. Как его найти?
Необходимо написать метод, возвращающих массив целых чисел, содержащий числа от 1 до 100 подряд по порядку.*/
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(creatingMassiv()));
        int[] AAA = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37,
                38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75,
                76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        System.out.println(doubleSearch(AAA));
    }

    // Названия методов нужны более говорящие, пока что по названиям непонятно, что делает метод
    public static int[] creatingMassiv() {
        int[] myArray = new int[100];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public static int doubleSearch(int[] falseArray) {
        int[] trueArray = creatingMassiv();
        int sum1 = 0;
        int sum2 = 0;
        // Давай в этом методе заменим циклы for на forEach (это который enhanced for)
        for (int i = 0; i < trueArray.length; i++) {
          sum1 =sum1 + trueArray[i]  ;
            System.out.println("сумма правильного массива =" + sum1);
        }
        for (int i = 0; i < falseArray.length; i++) {
            sum2 = sum2 + falseArray[i]  ;
            System.out.println("сумма неправильного массива =" + sum2);
        }
        return sum2 - sum1;
    }
}


