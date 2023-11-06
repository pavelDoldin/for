package For;

import java.util.Arrays;
import java.util.Random;

public class For {
    public static void main(String[] args) {
        ex9();
    }
    static void ex9(){
    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

        Random random = new Random();

        int count = 0;
        int countMax = 0;
        int a = 1;
        int size = random.nextInt(5,15);
        int[] arr = new int[size];
        System.out.println(size);

        for (int i = 0; i < arr.length; i++) {
           arr[i] = random.nextInt(2);
           if (arr[i] == a){
               count++;
           }
           else {
               if (count > countMax){
                   countMax = count;
               }
               count = 0;
           }

        }
        if (count > countMax){
            countMax = count;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(countMax);
    }
    static void ex8(){
        /*
        Напишите программу, которая генерирует 25 случайных чисел типа int,
        для каждого значения команда if - else сообщает, в каком отношении оно находится
        с другим числом(>, < или =).
         */
        Random random = new Random();

        int saiz = random.nextInt(1,25);
        int [] array = new int[saiz];

        System.out.println(saiz);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20, 46);
        }

        //int[] array = new Random().ints(26,20,46).toArray();

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length-1 ; i++) {
            if (array[i] > array[i + 1]){
                System.out.println(array[i] + " > " + array[i +1]);
            }
            else if (array[i] < array[i + 1]){
                System.out.println(array[i] + " < " + array[i + 1]);
            }
            else {
                System.out.println(array[i] + " = " + array[i +1]);
            }
        }
    }
    static void ex7(){
        //Объявляются 2 целочисленных переменных и им присваиваются значения.
        // Вывести на экран в интервале от меньшего к большему все чётные числа.

        int i = 5;
        int count = 15;

        for (; i <=count ; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    static void ex6(){
        //Вывести на экран числа от 5 до 95 включительно с интервалом 10

        int count = 95;
        for (int i = 5; i <= count ; i+=10) {
            System.out.println(i);
        }
    }
    static void ex5(){
        // Вывести на экран числа от 0 до 30 включительно с интервалом 5

        int count = 30;
        for (int i = 0; i <= count; i +=5) {
            System.out.println(i);
        }
    }
    static void ex4(){
        // Найти факториал n - числа

        int count = 5;
        int res = 1;
        for (int i = 1; i <= count; i++) {
            res *= i;
        }
        System.out.println(res);
    }
    static void ex3(){
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
    static void ex2(){
        //Необходимо вывести на экран таблицу умножения на 3:
        //В столбик
        //3*1=3 ; 3*2=6 ; 3*3=9 ; 3*4=12 ; 3*5=15 ; 3*6=18
        //3*7=21 ; 3*8=24 ; 3*9=27 ; 3*10=30

        int count = 10;
        for (int i = 1; i <= count; i++) {
            System.out.println("3 * " + i + " =" + 3*i);
        }
    }
    static void ex1(){
        //Необходимо вывести на экран числа от 5 до 1.
        //На экране должно быть: 5 4 3 2 1
        for (int i = 5; i >= 1 ; i--) {
            System.out.println(i);
        }
    }
    static void ex0(){
        //Необходимо вывести на экран числа от 1 до 5.
        //На экране должно быть: 1 2 3 4 5
        int count = 5;
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }

}
