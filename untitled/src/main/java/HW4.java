
//                   HW4

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HW4 {
//    static Scanner scanner;
//    public static void main(String[] args) {
//        scanner = new Scanner(System.in);
//
//        String ma = scanner.nextLine();
//        String ms = scanner.nextLine();            // Упрощенный ввод сканером (scanner).
//        String md = scanner.nextLine();
//        String mf = scanner.nextLine();
//
//        System.out.println(ma+ms+md+mf);
//    }

//    1.Организовать ввод и хранение данных пользователей. ФИО возраст, пол и выход из режима ввода информации
//    2.вывод в формате Фамилия И.О. возраст пол
//    3.добавить возможность выхода или вывода списка отсортированного по возрасту!)
//    4.*реализовать сортировку по возрасту с использованием индексов
//    5.*реализовать сортировку по возрасту и полу с использованием индексов

    static Scanner scanner;
        public static void main(String[] args) {
            scanner = new Scanner(System.in);

            ArrayList<String> lastnamelist = new ArrayList<>();
            ArrayList<String> firstnameslist = new ArrayList<>();
            ArrayList<String> secondnamelist = new ArrayList<>();
            ArrayList<String> floorlist = new ArrayList<>();
            ArrayList<Integer> agelist = new ArrayList<>();


            while (true) {
                System.out.println("Введите \"Старт\" для начала работы: ");
                System.out.println("Введите  \"Выход\" для выхода из программы: ");
                String select_1 = scanner.nextLine();
                System.out.println(select_1);
                String select_2 = scanner.nextLine();
                try {
                    if (select_1.equalsIgnoreCase("старт")) {
                        System.out.println("Добро пожаловать!");
                        break;
                    } else if (select_2.equalsIgnoreCase("выход")) {
                        System.out.println("Досвидания");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Введите верную команду!");
                }

            }
            while (true) {
                System.out.println("Введите фамилию: ");
                lastnamelist.add(scanner.nextLine());
                System.out.println("Введите имя: ");
                firstnameslist.add(scanner.nextLine());
                System.out.println("Введите отчество: ");
                secondnamelist.add(scanner.nextLine());
                System.out.println("Введите пол: ");
                floorlist.add(scanner.nextLine());
                System.out.println("Введите возраст: ");
                agelist.add(Integer.valueOf(scanner.nextLine()));
                System.out.println("Продолжить ввод да/нет? -> ");
                String tmp = scanner.nextLine();
                if (tmp.toLowerCase().contains("да")) continue;
                else if (tmp.toLowerCase().contains("нет")) break;
            }
            System.out.println("*".repeat(50));
            for (int i = 0; i < lastnamelist.size(); i++) {
                System.out.printf("%s %s.%s. %s %s\n", lastnamelist.get(i), firstnameslist.get(i).toUpperCase().charAt(0),
                        secondnamelist.get(i).toUpperCase().charAt(0), floorlist.get(i), agelist.get(i));
            }
            System.out.println("*".repeat(50));
            ArrayList<Integer> idlist = new ArrayList<>();
            for (int i = 0; i < lastnamelist.size(); i++) {
                idlist.add(i);
            }

            // Реализация сортировки по возрасту

            while (true) {
                System.out.println("Вы хотите продолжить работу c программой? Введите \"да\" для " +
                        "выполнения сортировки по возрасту и \"нет\" для выхода из программы: ");
                String select = scanner.nextLine();
                if (select.equalsIgnoreCase("да")) {
                    idlist.sort((o1, o2) -> agelist.get(o1) - agelist.get(o2));
                    System.out.println("*".repeat(50));
                    for (Integer integer : idlist) {
                        System.out.println(lastnamelist.get(integer) + " " +
                                firstnameslist.get(integer).toUpperCase().charAt(0) + "." +
                                secondnamelist.get(integer).toUpperCase().charAt(0) + "." + " "
                                + floorlist.get(integer) + " " + agelist.get(integer));
                    }
                    System.out.println("*".repeat(50));
                } else if (select.equalsIgnoreCase("нет")) {
                    System.out.println("Досвидания");
                    break;
                }
                break;
            }
            while (true) {
                System.out.println("Вы хотите продолжить работу c программой? Введите \"да\" для " +
                        "выполнения сортировки по возрасту и полу и \"нет\" для выхода из программы: ");
                String select = scanner.nextLine();
                if (select.equalsIgnoreCase("да")) {
                    idlist.sort(new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            String sex1 = floorlist.get(o1);
                            String sex2 = floorlist.get(o2);
                            int age1 = agelist.get(o1);
                            int age2 = agelist.get(o2);

                            // Сравнение по полу (сначала женщины, с учетом того, что женщина первая в списке)
                            int sexComparison = sex1.compareToIgnoreCase(sex2);
                            if (sexComparison != 0) {
                                return sexComparison;
                            }

                            // Сравнение по возрасту
                            return age1 - age2;
                        }
                    });
                    System.out.println("*".repeat(50));
                    for (Integer integer : idlist) {
                        System.out.printf("%s %s.%s. %s %s\n", lastnamelist.get(integer),
                                firstnameslist.get(integer).toUpperCase().charAt(0),
                                secondnamelist.get(integer).toUpperCase().charAt(0),
                                floorlist.get(integer), agelist.get(integer));
                    }
                    System.out.println("*".repeat(50));
                    break;

                } else if (select.equalsIgnoreCase("нет")) {
                    System.out.println("Досвидания");
                    break;

                }
            }
        }
}


