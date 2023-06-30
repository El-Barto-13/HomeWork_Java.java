//Seminar + HW1

//import java.util.Random;

//public class HW1 {
//    int gh = 5;
//    long aLong;
//    byte aByte;
//    short aShort;
//    char aChar = 'f';
//    float aFloat;
//    double aDouble;
//    boolean aBoolean;
//
//    int[] ints = new int[5];
//
//    //psvm или main точка входа (обязательно нужна) -->>
////    public static void main(String[] args) {
////    }
//
//
//    public static void main(String[] args) {
////        int[] ints = new int[5];
////        ints[3] = 2;
//
////        int[] tmp = new int[ints.length+1];
////        ints = tmp;
////
////        if (true) {
////
////        } else if (1>5) {
////
////        }else {
////
////        }
//////        или
////        if (true) ints[0]++; else if (1>5) ints[0]--; else ints[0]=0;        }
//////        или
////        if (true) {
////            ints[0]++;} else if (1>5) {
////            ints[0]--;} else {
////            ints[0]=0;}
//
//        int a = 0;
//        for (int i = 0; i<10; i++, a += i);
//
//        System.out.println(a);
//
//          System.out.println(Integer.toBinaryString(число)) - (Integer.toBinaryString) переводит 10чное число
//                                                                 в строку и строка ета в 2ном представлении
//                                                                 т.е 10ичное в 2ичное.
////        System.out.println(); -->> sout (быстрый вызов
////        System.out.println("!"); -->> "в двойные кавычки заключается объект"
////        System.out.println(new Random().nextInt(1000)); -->> (генератор случайных чисел до 1000)
//    }
//
//}


// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2



import java.util.Random;

public class HW1 {
    public static void main(String[] args) {
//    1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(2001);
        System.out.println("Случайное число i =  "+i);
//    2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа i
        int n = Integer.toBinaryString(i).length();
        System.out.println("Номер старшего значения бита n =  "+n);

//    3. Кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        short count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if ( j % n == 0) {
                count++;
            }
        }

        System.out.println("длина массива m1 =  "+count);
        int[] m1 = new int [count];

        count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j % n == 0) {
                m1[count++] = j;
            }
        }
//    4. Некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if ( j % n != 0) {
                count++;
            }
        }

        System.out.println("длина массива m2 =  "+count);
        int[] m2 = new int [count];

        count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j % n != 0) {
                m2[count++] = j;
            }
        }
    }
}
