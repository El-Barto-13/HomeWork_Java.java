
//                                               HW6

//Разработать программу, имитирующую поведение коллекции HashSet.
// В программе создать метод add добавляющий элемент,
// метод toString возвращающий строку с элементами множества
// *И метод позволяющий читать элементы по индексу.
// *Реализовать все методы из семинара.
//Формат данных Integer.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class HW6 {

    public static void main(String[] args) {
        MyHashSet<Integer> newSet = new MyHashSet<>();
        newSet.add(11);
        newSet.add(22);
        newSet.add(33);
        newSet.add(44);
        newSet.remove(11);
        System.out.println(newSet.add(55));

        System.out.println(newSet.valueOf(2));

        System.out.println(newSet);

        Iterator<Integer> iterator = newSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    static class MyHashSet<T> {
        private HashMap<T, Object> mySet = new HashMap<>();
        private static final Object Const = new Object();

        public boolean add(T value) {
            return mySet.put(value, Const) == null;
        }

        public boolean remove(T value) {
            return mySet.remove(value) != null;
        }

        public String toString() {
            return mySet.keySet().toString();
        }

        public Iterator<T> iterator() {
            return mySet.keySet().iterator();
        }

        public T valueOf(int index) {
            ArrayList<T> arrayList = new ArrayList<>(mySet.keySet());
            return arrayList.get(index);
        }
    }
}


