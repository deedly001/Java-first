import java.util.Objects;

public class Main {

  public static void main(String[] args) {
    System.out.println("Задание 1. \n");
    isLeapYear(2024);
    isLeapYear(2023);
    isDasher();

    System.out.println("Задание 2. \n");
    whichOS("Android", 2024);
    whichOS("IOS", 2014);
    isDasher();

    System.out.println("Задание 3. \n");
    deliveryCard(110);
  }

  public static void isDasher() {
    System.out.println("\n-----------------------------------\n");
  }

  public static void isLeapYear(int year) {
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0)) {
      System.out.println(year + " год — високосный год");
    } else {
      System.out.println(year + " год — не високосный год");
    }
  }

  public static void whichOS(String typeOS, int yearOfDevice) {
    if (Objects.equals(typeOS, "Android") && (yearOfDevice < 2015)) {
      System.out.println("Установите облегченную версию приложения для Android по ссылке");
    } else if (Objects.equals(typeOS, "Android") && (yearOfDevice >= 2015)) {
      System.out.println("Установите версию приложения для Android по ссылке");
    } else if (Objects.equals(typeOS, "IOS") && (yearOfDevice < 2015)) {
      System.out.println("Установите облегченную версию приложения для IOS по ссылке");
    } else if (Objects.equals(typeOS, "IOS") && (yearOfDevice >= 2015)) {
      System.out.println("Установите версию приложения для IOS по ссылке");
    } else {
      throw new RuntimeException("Вы ввели что-то другое, попробуйте снова");
    }
  }

  public static void deliveryCard(int distanceToDelivery) {
    byte daysForDelivery = 0;

    if (distanceToDelivery <= 20) {
      daysForDelivery += 1;
      System.out.println("На доставку потребуется дней: " + daysForDelivery);
    } else if (distanceToDelivery <= 60) {
      daysForDelivery += 2;
      System.out.println("На доставку потребуется дней: " + daysForDelivery);
    } else if (distanceToDelivery <= 100) {
      daysForDelivery += 3;
      System.out.println("На доставку потребуется дней: " + daysForDelivery);
    } else {
      System.out.println("Свыше 100 км доставки нет");
    }
  }
}







