public class Main {
    public static void main(String[] args) {


        // Задание 1
        String firstName = "Иван ";
        String middleMame = "Иванов ";
        String lastName = "Иванович ";
        String fullName = middleMame + firstName + lastName;
        System.out.println("Ф.И.О." + fullName);


        // Задание 2
        String fullNameMax = fullName.toUpperCase();
        System.out.println(" Данные ФИО сотрудника для заполнения отчета " + fullNameMax);

        // Задание 3
        fullName = "Иванов Семён Семёнович";
        String rename = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника " + rename);

        String[] cemen = fullName.split(" ");
        for (String cema : cemen) {
            if (cema.contains("ё")) {
                String[] splitname = cema.split("");
                for (int y = 0; y < splitname.length; y++) {
                    if (splitname[y].equals("ё")) {
                        splitname[y] = "е";
                    }
                    System.out.print(splitname[y]);
                }
                System.out.print(" ");
            } else {
                System.out.print(cema + " ");
            }

        }
        System.out.println();


        // Задание 4
       /* К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм,
       разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
        В качестве исходных данных используйте:
        Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
        строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
        переменная firstName — для хранения имени;
        переменная middleName — для хранения отчества;
        переменная lastName — для хранения фамилии.
                Решите задание с помощью метода substring().
                Результат программы выведите в формате:
“Имя сотрудника — …”
“Фамилия сотрудника — …”
“Отчество сотрудника — ...”
:лампочка: Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено.
Их должен вычислить компьютер.
:sos: Подсказка - Определить индексы символов помогут методы indexOf() и lastIndexOf().
                Критерии оценки
– При изменении содержания строки результат программы выполняется.
– Программа решена с помощью метода substring().
– Результат программы выведен в консоль согласно условиям задачи.*/

        // Задание 4

        String FIO = "Ivanov Ivan Ivanovich";
        System.out.println(FIO.indexOf(" "));
        System.out.println(FIO.lastIndexOf(" "));
        String surName1 = FIO.substring(0, 6);
        String name1 = FIO.substring(7, 11);
        String fatherName = FIO.substring(12, FIO.length());
        System.out.println("Имя сотрудника " + name1);
        System.out.println("Фамилия сотрудника " + surName1);
        System.out.println("Отчество сотрудника " + fatherName);


        // Задание 5
        /*Периодически данные в наших регистрах заполняются неверно, и Ф. И. О.
        сотрудников записывают со строчных букв.
                Такую оплошность нужно исправить, написав программу,
                которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
                В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“,
                 которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
        Выведите результат программы в консоль в формате:
        “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
:sos: Подсказка 1
        Метод toCharArray() может быть полезен.
:sos: Подсказка 2
        Для преобразования символа в верхний регистр следует использовать
         метод Character.toUpperCase(c), где c — символ.
                Критерии оценки
– Применен метод, меняющий написание данных строки.
– При изменении содержания строки результат программы выполняется.
– Результат программы выведен в консоль согласно условиям задачи.*/

        //Задание 5
        String fullname5 = "ivanov ivan ivanovich";
        String[] fullNameSeparation = fullname5.split(" ");
        char[] letters1 = fullNameSeparation[0].toCharArray();
        String myString = Character.toString(letters1[0]);
        System.out.println(letters1);


        // Задание 6
        /*Имеется две строки.
                Первая: "135"
        Вторая: "246"
        Соберите из двух строк одну, содержащую данные "123456".
                Использовать сортировку нельзя.
        Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
        Выведите результат в консоль в формате: “Данные строки — ….”
:sos: Подсказка
        Следует использовать StringBuilder.
                Критерии оценки
– Применен метод, меняющий написание данных строки.
– При изменении содержания строки результат программы выполняется.
– Результат программы выведен в консоль согласно условиям задачи.
*/
        //Задание 6
        String firstString = "135";
        String secondString = "246";
        StringBuilder doubleString = new StringBuilder(firstString + secondString);
        System.out.println(doubleString);
        doubleString.setCharAt(1, '2');
        doubleString.setCharAt(2,'3');
        doubleString.setCharAt(3,'4');
        doubleString.setCharAt(4,'5');
        System.out.println(doubleString);
        



        // Задание 7
       /* Дана строка из букв английского алфавита "aabccddefgghiijjkk".
                Нужно найти и напечатать буквы, которые дублируются в строке.
                Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
                В итоге в консоль должен быть выведен результат программы: "acdgijk".
                Критерии оценки
– Данные в строке отсортированы корректно.
– При изменении содержания строки результат программы выполняется.
– Результат программы выведен в консоль согласно условиям задачи.*/

    }

}







