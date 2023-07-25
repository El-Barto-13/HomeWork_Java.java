//
//
////                                   HW5
//
//
//// Реализуйте структуру телефонной книги с помощью HashMap.
//// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
//// их необходимо считать, как одного человека с разными телефонами.
//// Вывод должен быть отсортирован по убыванию числа телефонов.
//
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.Map;
//
//public class HW5 {
//    public static void main(String[] args) {
//        String[] lastNames = new String[]{"Майский Жук Летович", "Пчел Вжух Опыляевич",
//                "Мух Оса Полосатовна", "Мурлыков Кот Урурукович", "Шуршилова Шиншилла Копошиловна"};
//        Integer[] numbers = new Integer[]{121212, 232323, 343434, 454545, 565656};
//        Map<Integer, String> phonebook = new HashMap<>();
//        for (int i = 0; i < lastNames.length; i++) {
//            phonebook.put(numbers[i], lastNames[i]);
//        }
//        System.out.println("_".repeat(155));
//        System.out.println(phonebook);
//        System.out.println("_".repeat(155));
//        phonebook.entrySet().stream().sorted(Map.Entry.comparingByKey((Comparator<Integer>) (o1, o2) -> o2 - o1)).forEach(System.out::println);
//
//    }
//}