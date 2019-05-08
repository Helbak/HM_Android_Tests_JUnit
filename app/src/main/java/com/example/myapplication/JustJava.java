package com.example.myapplication;
import java.util.ArrayList;
public class JustJava {
//JustJava j=new JustJava();
    public static void main(String[] args) {
//        JustJava jj=new JustJava();
        printAll();
    }

    private  static void printAll() {
        JustJava j=new JustJava();
        int[] array = {4, 2, 8, 2, 2, 3};
        System.out.println(ab(2, 3)
                +
                ", The point is located in the quart N " +
                whereIsPoint(3, -2) +
                " ,  sum of positive numbers = " + sumOnlyPositive(2, -2, 2) +
                " , sumFromMaxPlus3 = " +
                sumFromMaxPlus3(1, 1, 1) +
                ",  Estimation is -" + scoringOfStudent(99) +
                sumAndAmount() +
                "is this justNumber -" + justNumber(11112) +
                ", sqRound = " + sqRound(10) +
                ", factorial = " + factorial(6) +
                ", Sum of numbers = " + sumOfSign(123) +
                ", mirror = " + mirror(12345) +
                ", min from array = " + minFromArray(array) + ", max from array = " + maxFromArray(array) +
                ", index of min from array = " + indexOfMinFromArray(array) +
                ", index of max from array = " + indexOfMaxFromArray(array) +
                " sumOfUneven numbers " + sumOfUneven(array) +
                ", last number of revers array = " + reversArray(array) +
                ", amount of uneven =" + uneven(array) +
                ", change Halfs of array- " + changeHalfs(array)
                + "sort Bubble array- " + sortBubble(array)
                + ", sort selection - " + sortSelection(array)
                + "sort insert - " + sortInsert(array)
                + ", day of week - " + dayOfWeek(6)
                + ", numberToWord - " + numberToWord(300)
                + ", word to number - " + wordToNumber("three hundred seventy one") +
                ", distance to point = " + distance(3, 2, 4, 1)

        );
    }
    public  static int forTest(int a){
        return a*2;
    }

    //Если а – четное посчитать а*б, иначе а+б
    public  static int ab(int a, int b) {
        if (a/1!=a || b/1!=b|| a==0) {
            return 0;}
        if (a % 2 == 0)
            return a + b;
        else
            return a * b;
    }

    ;

    //    //Определить какой четверти принадлежит точка с координатами (х,у)
    public static int whereIsPoint(int x, int y) {
        if(x==0&&y==0){
            return 0;
        }
        if (x > 0 && y > 0) {
            return 1;
        }
        if (x > 0 && y < 0) {
            return 2;
        }
        if (x < 0 && y < 0) {
            return 3;
        }
        if (x < 0 && y > 0) {
            return 4;
        } else return 0;
    }

    //    //Найти суммы только положительных из трех чисел
    public static int sumOnlyPositive(int a, int b, int c) {
        if (a < 0)
            a = 0;
        if (b < 0)
            b = 0;
        if (c < 0)
            c = 0;
        return a + b + c;
    }

    //    // Посчитать выражение макс(а*б*с, а+б+с)+3
    public static int sumFromMaxPlus3(int a, int b, int c) {
        if (a + b + c > a * b * c) {
            return a + b + c + 3;
        }
        return a * b * c + 3;
    }

    //    //Написать программу определения оценки студента по его рейтингу, на основе
//// следующих правил
    public static String scoringOfStudent(int a) {
        if (a <= 100 && a >= 90)
            return " A ";
        if (a >= 75 && a <= 89)
            return " B ";
        if (a >= 60 && a <= 74)
            return " C ";
        if (a >= 40 && a <= 59)
            return " D ";
        if (a >= 20 && a <= 39)
            return " E ";
        if (a >= 0 && a <= 19)
            return " F ";

        return " false ";
    }

    //    // Найти сумму четных чисел и их количество в диапазоне от 1 до 99
    public static String sumAndAmount() {
        String res = null;
        int sum = 0;
        int amount = 0;
        for (int i = 2; i <= 99; i = i + 2) {
            sum = sum + i;
            amount++;
            res = "sum =  " + sum + " amount = " + amount;
        }
        return res;
    }

    //    // Проверить простое ли число?
    public static boolean justNumber(int a) {
        int timesDiv = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                timesDiv++;
        }

        if (timesDiv == 0) {
            return true;
        }
        return false;
    }

    //Найти корень натурального числа с точностью до целого
    public static int sqRound(int a) {
        int res = (int) Math.sqrt(a);
        return res;
    }

    //    //Вычислить факториал числа n.
    public static int factorial(int a) {
        int fac = 1;
        for (int i = 1; i <= a; i++) {
            fac = fac * i;
        }
        return fac;
    }

    //    //Посчитать сумму цифр заданного числа
    public static int sumOfSign(int a) {
        int sum = 0;
        String aString = Integer.toString(a);
        char[] numbers = aString.toCharArray();

        for (int i = 0; i < numbers.length; i++) {
            char num = numbers[i];
            int n = Character.getNumericValue(num);
            sum = sum + n;

        }
        return sum;
    }

    //    //Вывести число, которое является зеркальным отображением последовательности
//// цифр заданного числа
    public static int mirror(int a) {
        String aString = Integer.toString(a);
        char[] numbers = aString.toCharArray();
        String resString = "";
        for (int i = numbers.length - 1; i >= 0; i--) {
            resString = resString + numbers[i];
        }
        int resNumber = Integer.parseInt(resString);
        return resNumber;
    }

    //
//    // Найти минимальный элемент массива
    public static int minFromArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    //    // Найти максимальный элемент массива
    public static int maxFromArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    //    // 3. Найти индекс минимального элемента массива
    public static int indexOfMinFromArray(int[] array) {
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    //    // 4. Найти индекс максимального элемента массива
    public static int indexOfMaxFromArray(int[] array) {
        int max = array[0];
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    //    // 5. Посчитать сумму элементов массива с нечетными индексами
    public static int sumOfUneven(int[] array) {
        int uneven = 0;
        for (int i = 1; i < array.length; i = i + 2) {
            uneven = uneven + array[i];
        }
        return uneven;
    }

    // 6. Сделать реверс массива (массив в обратном направлении)
    public static int reversArray(int[] array) {
        int[] rev = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            rev[array.length - i - 1] = array[i];
        }
        return rev[rev.length - 1];
    }


    // 7. Посчитать количество нечетных элементов массива
    public static int uneven(int[] array) {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                amount++;
        }
        return amount;
    }

    //
//    // 8. Поменять местами первую и вторую половину массива, например, для массива 1 2 3
//// 4, результат 3 4 1 2
    public static String changeHalfs(int[] array) {
        int[] changedAr = new int[array.length];
        int middle = array.length / 2;
        int n = 0;
        for (int i = middle; i < array.length; i++) {
            changedAr[n] = array[i];
            n++;
        }
        for (int i = 0; i < array.length / 2; i++) {

            changedAr[middle] = array[i];
            middle++;
        }
        String done = "";
        for (int i = 0; i < changedAr.length; i++) {
            done = done + Integer.toString(changedAr[i]);
        }
        return done;
    }

    //    // 9. Отсортировать массив (пузырьком (Bubble),  вставками (Insert))
    public static String sortBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        String done = "";
        for (int i = 0; i < array.length; i++) {
            done = done + Integer.toString(array[i]);
        }
        return done;
    }

    //// 9. Отсортировать массив  выбором (Select)
//
    public static String sortSelection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        String done = "";
        for (int i = 0; i < array.length; i++) {
            done = done + Integer.toString(array[i]);
        }
        return done;
    }

//// 9. Отсортировать массив вставками (Insert))

    public static String sortInsert(int[] array) {
        for (int i = 1; i > array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        String done = "";
        for (int i = 0; i < array.length; i++) {
            done = done + Integer.toString(array[i]);
        }
        return done;
    }


    //    // Получить строковое название дня недели по номеру дня.
    public static String dayOfWeek(int dayIndex) {
        switch (dayIndex) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
        }
        return "false";
    }

    //    // 2. Вводим число (0-999), получаем строку с прописью числа.
    public static String numberToWord(int a) {

        String word = Integer.toString(a);
        char[] wordArr = word.toCharArray();
        int[] wordInt = new int[wordArr.length];
        for (int i = 0; i < wordInt.length; i++) {

            wordInt[i] = (int) (wordArr[i] - '0');
        }
        String[] oneArr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] twoArr = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] threeArr = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] fourArr = {"one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};

        if (wordArr.length == 1) {
            return oneArr[a - 1];
        }
        if (wordArr.length == 2 && wordInt[0] == 1) {
            return twoArr[wordInt[1]];
        }
        if (wordArr.length == 2 && wordInt[0] != 1 && wordInt[1] != 0) {
            String res = threeArr[wordInt[0] - 2] + " " + oneArr[wordInt[1] - 1];
            return res;
        }
        if (wordArr.length == 2 && wordInt[0] != 1 && wordInt[1] == 0) {
            return threeArr[wordInt[0] - 2];
        }
        if (wordArr.length == 3 && wordInt[1] == 1) {//113
            String res = fourArr[wordInt[0] - 1] + " " + twoArr[wordInt[2]];
            return res;
        }
        if (wordArr.length == 3 && wordInt[1] != 1 && wordInt[1] != 0 && wordInt[2] != 0) {//123
            String res = fourArr[wordInt[0] - 1] + " " + threeArr[wordInt[1] - 2] + ' ' + oneArr[wordInt[2] - 1];
            return res;
        }
        if (wordArr.length == 3 && wordInt[1] != 1 && wordInt[1] != 0 && wordInt[2] == 0) {//120
            String res = fourArr[wordInt[0] - 1] + " " + threeArr[wordInt[1] - 2];
            return res;
        }
        if (wordArr.length == 3 && wordInt[1] == 0 && wordInt[2] == 0) {//900
            return fourArr[wordInt[0] - 1];
        }
        if (wordArr.length == 3 && wordInt[1] == 0 && wordInt[2] != 0) {//103
            String res = fourArr[wordInt[0] - 1] + " " + oneArr[wordInt[2] - 1];
            return res;
        }
        return null;
    }

    // 3. Вводим строку, которая содержит число, написанное прописью (0-999). Получить само
// число
    public static int wordToNumber(String words) {
        String[] wordArr = words.split(" ");
        for (int i = 0; i < wordArr.length; i++) {
            System.out.println("-" + wordArr[i] + "-");
        }
        String h = new String("hundred");
        String[] oneArr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] twoArr = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] threeArr = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (wordArr.length == 1) {
            for (int i = 0; i < oneArr.length; i++) {//One word
                if (oneArr[i] == wordArr[0])
                    return i + 1;
            }
            for (int i = 0; i < twoArr.length; i++) {//14
                if (twoArr[i] == wordArr[0]) {
                    return i + 10;
                }
            }
            for (int i = 0; i < threeArr.length; i++) {//40
                if (threeArr[i] == wordArr[0])
                    return (i + 2) * 10;
            }
        }
        System.out.println(!wordArr[1].equals(h));
        System.out.println(wordArr[1].equals(h));
        System.out.println(wordArr.length == 2);
        if (wordArr.length == 2 && wordArr[1].equals(h)) {//200
            for (int i = 0; i < oneArr.length; i++) {
                if (oneArr[i].equals(wordArr[0])) {
                    int res = (i + 1) * 100;
                    return res;
                }
            }
        }
        if (wordArr.length == 2 && !wordArr[1].equals(h)) {///22
            String first = null;
            String second = null;
            for (int i = 0; i < threeArr.length; i++) {
                if (threeArr[i].equals(wordArr[0]))
                    first = Integer.toString(i + 2);
            }
            for (int i = 0; i < oneArr.length; i++) {
                if (oneArr[i].equals(wordArr[1]))
                    second = Integer.toString(i + 1);
            }
            String res = first + second;
            return Integer.parseInt(res);
        }
        if (wordArr.length == 3) {
            String first = null;
            String second = null;
            for (int i = 0; i < oneArr.length; i++) {
                if (oneArr[i].equals(wordArr[0])) {
                    first = Integer.toString(i + 1);
                    for (i = 0; i < oneArr.length; i++) {//101
                        if (oneArr[i].equals(wordArr[2])) {
                            second = Integer.toString(i + 1);
                            String res = first + "0" + second;
                            return Integer.parseInt(res);
                        }
                    }
                    for (i = 0; i < twoArr.length; i++) {//111
                        if (twoArr[i].equals(wordArr[2])) {
                            second = Integer.toString(i + 10);
                            String res = first + second;
                            return Integer.parseInt(res);
                        }
                    }
                    for (i = 0; i < threeArr.length; i++) {//120
                        if (threeArr[i].equals(wordArr[2])) {
                            second = Integer.toString((i + 2) * 10);
                            String res = first + second;
                            return Integer.parseInt(res);
                        }
                    }
                }
            }
        }
        if (wordArr.length == 4) {
            String first = null;
            String second = null;
            String third = null;
            for (int i = 0; i < oneArr.length; i++) {
                if (oneArr[i].equals(wordArr[0])) {
                    first = Integer.toString(i + 1);
                }
            }
            for (int i = 0; i < threeArr.length; i++) {
                if (threeArr[i].equals(wordArr[2])) {
                    second = Integer.toString(i + 2);
                }
            }
            for (int i = 0; i < oneArr.length; i++) {
                if (oneArr[i].equals(wordArr[3])) {
                    third = Integer.toString(i + 1);
                    String res = first + second + third;
                    return Integer.parseInt(res);
                }
            }
        }
        return 0;
    }

    //    // 4. Найти расстояние между двумя точками в двумерном декартовом пространстве.
    public static double distance(int xa, int ya, int xb, int yb) {
        double dist = Math.sqrt(Math.pow((xb - xa), 2) + Math.pow((yb - ya), 2));
        return dist;

    }
}
