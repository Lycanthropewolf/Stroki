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


    }

}







