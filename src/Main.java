public class Main {

  public static void main(String[] args) {

    firstTask();
    secondTask();
    thirdTask();
//    fourthTask();
//    fifthTask();
//    sixthTask();
//    seventhTask();
//    eighthTask();
//    ninthTask();
//    tenthTask();
  }


  static void firstTask() {
    System.out.println("Задача 1 \n");

    String stName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
//    String fullName = stName + " " + middleName + " " + lastName;
    String fullName = String.join(" ", stName, middleName, lastName);
    System.out.println("Ф. И. О. сотрудника — " + fullName);
  }

  static void secondTask() {
    System.out.println("\nЗадача 2 \n");

    String stName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = String.join(" ", stName, middleName, lastName).toUpperCase();

    System.out.println("Ф. И. О. сотрудника — " + fullName);
  }

  static void thirdTask() {
    System.out.println("\nЗадача 3 \n");

    String stName = "Семён";
    String middleName = "Семёнович";
    String lastName = "Иванов";
    String fullName = String.join(" ", stName, middleName, lastName);

    System.out.println("Ф. И. О. сотрудника — " + fullName.replace("ё", "е").replace("Ё", "Е"));
  }

  static void fourthTask() {
    System.out.println("\nЗадача 4 \n");

  }

  static void fifthTask() {
    System.out.println("\nЗадача 5 \n");

  }

  static void sixthTask() {
    System.out.println("\nЗадача 6 \n");


  }

  static void seventhTask() {
    System.out.println("\nЗадача 7 \n");


  }

  static void eighthTask() {
    System.out.println("\nЗадача 8 \n");


  }

  static void ninthTask() {
    System.out.println("\nЗадача 9 \n");

  }

  static void tenthTask() {
    System.out.println("\nЗадача 10 \n");

  }
}






