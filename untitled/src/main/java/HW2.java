//
//
//                // ПРИМЕР HW2 ЧУЖОЙ РАБОТЫ ДЛЯ РАЗБОРА И ПОНИМАНИЯ НА РАБОЧЕМ СТОЛЕ!
//                //НЕ ЗАБРАСЫВАТЬ!!!!!!__РАЗОБРАТЬСЯ!!!!!!__ДОДЕЛАТЬ!!!!!!
//
//   комментарий преподавателя Евгения:
//
//   Возьмите простую строку и замените пару символов в строке на другие символя реплейсом,
//   распелите сплитом и стриннгбилдером соберите обратно.
//   В этом смысл практики, постановка дз корявая это я согласен!) За упорство зачёт!)
//
//
//
//import java.io.FileReader;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//
//
//public class HW2 {
//    //1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//    //используя StringBuilder или String. Данные для фильтрации приведены ниже в виде json-строки.
//    //Если значение null, то параметр не должен попадать в запрос.
//    //Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//
//    public static void main(String[] args) {
//    String Sql = "select * from students where ";
//    String stringSQL = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
//    String[] tmpSQL = stringSQL.split(",");
//    StringBuilder clearSQL = new StringBuilder();
//    for (String s : tmpSQL){
//        if (!s.contains("null")) clearSQL.append(s)
//    }
//    stringSQL = clearSQL.toString();
//    String[] res = clearSQL.split(" ");
//    }
//}
