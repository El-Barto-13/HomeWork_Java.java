//
////         HW3
//// Пусть дан произвольный список целых чисел.
//// 1) Нужно удалить из него чётные числа
//// 2) Найти минимальное значение
//// 3) Найти максимальное значение
//// 4) Найти среднее значение
//
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Random;
//
//public class HW3 {
//    public static void main(String[] args) {
//        // Дан произвольный (рандомный) список целых чисел.
//        ArrayList<Integer> list = new ArrayList<>();
//            for (int i = 0; i < 10; i++) {
//                list.add(new Random().nextInt(100));
//            }
//            System.out.print("Созданный список: ");
//            System.out.println(list);
//
//            // 1) Нужно удалить из него чётные числа
//            Iterator<Integer> iterator = list.iterator();
//            while (iterator.hasNext()) {
//                int num = iterator.next();
//                if (num % 2 == 0) {
//                    iterator.remove();
//                }
//            }
//            System.out.print("Список c удаленными четными числами: ");
//            System.out.println(list);
//
//            //2) Найти минимальное значение
//            int minValue = list.get(0);
//            System.out.println("Минимальное значение: " + minValue);
//
//            // 3) Найти максимальное значение
//            int maxValue = list.get(list.size() - 1);
//            System.out.println("Максимальное значение: " + maxValue);
//
//            // 4) Найти среднее значение
//            int average = list.get(list.size() / 2);
//            System.out.println("Среднее значение: " + average);
//        }
//    }
//
