import java.util.Random;

public class HW1 {
    int gh = 5;
    long aLong;
    byte aByte;
    short aShort;
    char aChar = 'f';
    float aFloat;
    double aDouble;
    boolean aBoolean;

    int[] ints = new int[5];

    //psvm или main точка входа (обязательно нужна) -->>
//    public static void main(String[] args) {
//    }


    public static void main(String[] args) {
//        int[] ints = new int[5];
//        ints[3] = 2;

//        int[] tmp = new int[ints.length+1];
//        ints = tmp;
//
//        if (true) {
//
//        } else if (1>5) {
//
//        }else {
//
//        }
////        или
//        if (true) ints[0]++; else if (1>5) ints[0]--; else ints[0]=0;        }
////        или
//        if (true) {
//            ints[0]++;} else if (1>5) {
//            ints[0]--;} else {
//            ints[0]=0;}

        int a = 0;
        for (int i = 0; i<10; i++, a += i);

        System.out.println(a);


//        System.out.println(); -->> sout (быстрый вызов
//        System.out.println("!"); -->> "в двойные ковычки заключается объект"
//        System.out.println(new Random().nextInt(1000)); -->> (гениратор случайных чисел)
    }

}
