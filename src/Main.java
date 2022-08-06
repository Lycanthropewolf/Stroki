public class Main {
    public static void main(String[] args) {


        // Задание 1
        String firstName = " Иван";
        String middleMame = " Иванов";
        String lastName = " Иванович";
        String fullName = middleMame +firstName +lastName;
        System.out.println("Ф.И.О." + fullName);


        // Задание 2
        String fullNameMax = fullName.toUpperCase();
        System.out.println(" Данные ФИО сотрудника для заполнения отчета" + fullNameMax);

        // Задание 3
        fullName = " Иванов Семён Иванович";
        fullName = fullName.replace( "ё","е");
        System.out.println(fullName);


    }
}
