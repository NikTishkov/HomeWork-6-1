public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        //Task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName + ".";
        System.out.println("Ф.И.О. сотрудника — " +fullName);
        System.out.println("Task 2");
        //Task 2
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. для заполнения отчета — " + fullName1);
        System.out.println("Task 3");
        //Task 3
        firstName = firstName.replace("Ivan","Семён");
        lastName = lastName.replace("Ivanov", "Иванов");
        middleName = middleName.replace("Ivanovich", "Семёнович");
        fullName = lastName + " " + firstName + " " + middleName + ".";
        String fullNameCorrect = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника — "+fullNameCorrect);
    }
}