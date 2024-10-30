public class Main {

  public static void main(String[] args) {
    System.out.println("Задание 1. \n");
    System.out.println(isLeapYear(2024));
    System.out.println(isLeapYear(2023));
    printDasher();

    System.out.println("Задание 2. \n");
    System.out.println(updateAppMessage(1, 2024));
    System.out.println(updateAppMessage(0, 2014));
//    updateAppMessage(1, 2024);
//    updateAppMessage(0, 2014);
    printDasher();

    System.out.println("Задание 3. \n");
    System.out.println(deliveryCard(110));
    System.out.println(deliveryCard(25));
    System.out.println(deliveryCard(65));
    System.out.println(deliveryCard(2));
  }

  public static void printDasher() {
    System.out.println("\n-----------------------------------\n");
  }

  public static String isLeapYear(int year) {
    String message = "";

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      message += year + " год — високосный год";
    } else {
      message += year + " год — не високосный год";
    }
    return message;
  }

  public static String updateAppMessage(int typeOS, int yearOfDevice) {
    String message = "";

    if (typeOS == 1) {
      if (yearOfDevice < 2015) {
        message += "Установите облегченную версию приложения для Android по ссылке";
      } else {
        message += "Установите версию приложения для Android по ссылке";
      }
    } else if (typeOS == 0) {
      if (yearOfDevice < 2015) {
        message += "Установите облегченную версию приложения для IOS по ссылке";
      } else {
        message += "Установите версию приложения для IOS по ссылке";
      }
    } else {
      message += "вы ввели что-то другое";
    }
    return message;
  }

  public static String deliveryCard(int distanceToDelivery) {
    byte daysForDelivery = 0;
    String message = "";

    if (distanceToDelivery <= 20) {
      daysForDelivery += 1;
      message += "На доставку потребуется дней: " + daysForDelivery;
    } else if (distanceToDelivery <= 60) {
      daysForDelivery += 2;
      message += "На доставку потребуется дней: " + daysForDelivery;
    } else if (distanceToDelivery <= 100) {
      daysForDelivery += 3;
      message += "На доставку потребуется дней: " + daysForDelivery;
    } else {
      message += "Свыше 100 км доставки нет";
    }
    return message;
  }
}

