package For;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class For {
    public static void main(String[] args) {

        System.out.println(ex14());
    }
    static boolean ex14(){

        // проверить слово на полиндром
        String str = "потопf";

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    static void ex13() {

        /*
         написать пузырьковый в цикле while
         */
        Random random = new Random();

        int syez = random.nextInt(3, 10);

        int[] arr = new int[syez];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 11);
        }

        System.out.println(Arrays.toString(arr));


        int temp;
        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sort = false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    static void ex12() {
        /*
        Написать пузырьковый метод сортировки
         */

        Random random = new Random();
        int seyz = random.nextInt(4, 8);

        int[] arr = new int[seyz];

        for (int i = 0; i < seyz; i++) {
            arr[i] = random.nextInt(0, 10);
        }
        System.out.println(Arrays.toString(arr));

        int temp;
// не совиршенный метод так как он дудет делаться столько раз сколько элеменнтов в массиве,
// а отсортироваться он может раньше

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    static void ex11() {

        // Поработать и ArrayList
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(8);

        ArrayList arrayList = new ArrayList<>();
        arrayList.add("123");
        arrayList.add(12);      // метод add добовляет в список
        arrayList.add(123);


        System.out.println(arrayList);
        System.out.println(arrayList.size()); // Выведет количество элементов в списке
        System.out.println(arrayList.get(2)); // Выведет по индексу значение
        System.out.println();
        arrayList.set(0, 1);                   // Добавит элемент под индексом
        //arrayList.remove(2);            // Удалит по индексу

        System.out.println(arrayList);

        System.out.println(arrayList.subList(0, 1));


    }

    static void ex10() {

        /*
        Дан мфссив nums = [3, 2, 5, 3] и число val = 3 и тог: [2, 5, 3, 3]
        Если в массиве есть числа, равные заданном, нужно перенести эти элементы в конец массива.
        Таким образзом, первые несколько (или все) элементов массива должны быть отличны от задонного,
        а остальные - равны ему.
         */
        Random random = new Random();

        int syiz = random.nextInt(5, 21);
        int[] nums = new int[syiz];
        int val = 3;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(5);
        }

        System.out.println(Arrays.toString(nums));


        int[] res = new int[nums.length];
        Arrays.fill(res, val);

        for (int i = 0, j = 0; i < nums.length; i++) {
                if (nums[i] != val){
                        res[j] = nums[i];
                        j++;
                    }
            }

        System.out.println(Arrays.toString(res));

    }

    static void ex9() {
        //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

        Random random = new Random();

        int count = 0;
        int countMax = 0;
        int a = 1;
        int size = random.nextInt(5, 15);
        int[] arr = new int[size];
        System.out.println(size);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
            if (arr[i] == a) {
                count++;
            } else {
                if (count > countMax) {
                    countMax = count;
                }
                count = 0;
            }

        }
        if (count > countMax) {
            countMax = count;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(countMax);
    }

    static void ex8() {
        /*
        Напишите программу, которая генерирует 25 случайных чисел типа int,
        для каждого значения команда if - else сообщает, в каком отношении оно находится
        с другим числом(>, < или =).
         */
        Random random = new Random();

        int saiz = random.nextInt(1, 25);
        int[] array = new int[saiz];

        System.out.println(saiz);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20, 46);
        }

        //int[] array = new Random().ints(26,20,46).toArray();

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println(array[i] + " > " + array[i + 1]);
            } else if (array[i] < array[i + 1]) {
                System.out.println(array[i] + " < " + array[i + 1]);
            } else {
                System.out.println(array[i] + " = " + array[i + 1]);
            }
        }
    }

    static void ex7() {
        //Объявляются 2 целочисленных переменных и им присваиваются значения.
        // Вывести на экран в интервале от меньшего к большему все чётные числа.

        int i = 5;
        int count = 15;

        for (; i <= count; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void ex6() {
        //Вывести на экран числа от 5 до 95 включительно с интервалом 10

        int count = 95;
        for (int i = 5; i <= count; i += 10) {
            System.out.println(i);
        }
    }

    static void ex5() {
        // Вывести на экран числа от 0 до 30 включительно с интервалом 5

        int count = 30;
        for (int i = 0; i <= count; i += 5) {
            System.out.println(i);
        }
    }

    static void ex4() {
        // Найти факториал n - числа

        int count = 5;
        int res = 1;
        for (int i = 1; i <= count; i++) {
            res *= i;
        }
        System.out.println(res);
    }

    static void ex3() {
        /*
        Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
        все числа от 1 до введенного пользователем числа.
        Например:
        если пользователь введет число 3. Программа должна посчитать сумму чисел от 1 до 3,
        то есть 1+2+3 и выдать ответ 6.
        если пользователь введет число 5. Программа должна посчитать сумму чисел от 1 до 5,
        то есть 1+2+3+4+5 и выдать ответ 15.
         */
        int sum = 0;
        int count = 5;
        for (int i = 1; i <= count; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void ex2() {
        //Необходимо вывести на экран таблицу умножения на 3:
        //В столбик
        //3*1=3 ; 3*2=6 ; 3*3=9 ; 3*4=12 ; 3*5=15 ; 3*6=18
        //3*7=21 ; 3*8=24 ; 3*9=27 ; 3*10=30

        int count = 10;
        for (int i = 1; i <= count; i++) {
            System.out.println("3 * " + i + " =" + 3 * i);
        }
    }

    static void ex1() {
        //Необходимо вывести на экран числа от 5 до 1.
        //На экране должно быть: 5 4 3 2 1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }

    static void ex0() {
        //Необходимо вывести на экран числа от 1 до 5.
        //На экране должно быть: 1 2 3 4 5
        int count = 5;
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }
}
