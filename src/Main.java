public class Main {
    public static void main(String[] args) {
        // задача 1.
        firstTask(17);
        // задача 2.
        secondTask(+5);
        // задача 3.
        thirdTask(60);
        // задача 4.
        fourthTask(5);
        // задача 5.
        fifthTask(14);
        // задача 6.
        sixthTask(62);
        // задача 7.
        seventhTask();
        // задача 8.

    }

    static void firstTask(int userAge) {
        System.out.println("Задача 1 \n");
        if (userAge >= 18) {
            System.out.println("Пользователю " + userAge + " лет, совершеннолетний");
        } else {
            System.out.println("Пользователю " + userAge + " лет, возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

//        String minorUser = "Пользователю " + userAge + " лет, совершеннолетний";
//        String adultUser = "Пользователю " + userAge + " лет, возраст совершеннолетия еще не наступил, нужно немного подождать";
//        String result  = (userAge >= 18) ? minorUser : adultUser;
//        System.out.println(result);

//        String result = (userAge >= 18) ? "Пользователю " + userAge + " лет, совершеннолетний" : "Пользователю " + userAge + " лет, возраст совершеннолетия еще не наступил, нужно немного подождать";
//        System.out.println(result);
    }

    static void secondTask(int streetTemp) {
        System.out.println("\nЗадача 2 \n");
        if (streetTemp >= 5) {
            System.out.println("За окном +" + streetTemp + "°C , сегодня тепло, можно идти без шапки");
        } else if (streetTemp <= -5) {
            System.out.println("За окном " + streetTemp + "°C , на улице холодно, нужно надеть шапку");
        } else {
            System.out.println("За окном немного прохладно"); // отсебятина, а то вывод неполноценным кажется
        }
    }

    static void thirdTask(int userSpeed) {
        System.out.println("\nЗадача 3 \n");
        if (userSpeed > 60) {
            System.out.println("Ваша скорость " + userSpeed + " км/ч, придется заплатить штраф");
        } else {
            System.out.println("Ваша скорость " + userSpeed + " км/ч, можно ездить спокойно");
        }
//        String result = (userSpeed > 60) ? "Ваша скорость "+ userSpeed +" км/ч, придется заплатить штраф" : "Ваша скорость "+ userSpeed +" км/ч, можно ездить спокойно";
//        System.out.println(result);
    }

    static void fourthTask(int userAge) {
        System.out.println("\nЗадача 4 \n");
        if (userAge >= 2 && userAge <= 6) {
            System.out.println("Если возраст человека равен " + userAge + " лет, то ему нужно ходить в детский сад");
        } else if (userAge >= 7 && userAge <= 17) {
            System.out.println("Если возраст человека равен " + userAge + " лет, то ему нужно ходить в школу");
        } else if (userAge >= 18 && userAge <= 24) {
            System.out.println("Если возраст человека равен " + userAge + " лет, то ему нужно ходить в университет");
        } else if (userAge > 24) {
            System.out.println("Если возраст человека равен " + userAge + " лет, то ему нужно ходить в университет");
        }
    }


    static void fifthTask(int userAge) {
        System.out.println("\nЗадача 5 \n");
        if (userAge < 5) {
            System.out.println("Если ребенку " + userAge + " лет, он не может кататься на аттракционе");
        } else if (userAge < 14) { // (userAge >= 5 && userAge < 14) IDE говорит что бессмысленно писать так, тк оно и так проходит
            System.out.println("Если ребенку " + userAge + " лет, он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {//else if (userAge >= 14) тоже самое с IDE
            System.out.println("Если ребенку " + userAge + " лет, он может кататься без сопровождения взрослого.");
        }
    }

    static void sixthTask(int totalPassengers) {
        // по этой задаче как я понял: вместимость вагона 102 места, из них 60 сидячие и 42 стоячие,
        // по жизненному опыту понимаю что всегда занимают сначала сидячие места, а потом стоячие
        System.out.println("\nЗадача 6 \n");
        int totalPlace = 102;
        int sittingPlace = 60;
        int standingPlace = 42;
        if (totalPassengers <= 60) {
            sittingPlace -= totalPassengers;
            totalPlace -= totalPassengers;
            System.out.println("Всего в вагоне свободно мест : " + totalPlace + " , из них " + sittingPlace + " сидячих, стоячих: " + standingPlace);
        } else if (totalPassengers <= 102) {
            sittingPlace = 0;
            standingPlace = 102 - totalPassengers;
            totalPlace -= totalPassengers;
            System.out.println("Всего в вагоне свободно мест : " + totalPlace + " , из них " + sittingPlace + " сидячих, стоячих: " + standingPlace);
        } else {
            System.out.println("Вагон уже полностью забит.");
        }
    }

    static void seventhTask() {
        System.out.println("\nЗадача 7 \n");
        int oneNum = 100;
        int twoNum = 200;
        int threeNum = 30;
        if (oneNum > twoNum && oneNum > threeNum) {
            System.out.println("Первое число больше других и равняется " + oneNum);
        } else if (oneNum < twoNum && twoNum > threeNum) {
            System.out.println("Второе число больше других и равняется " + twoNum);
        } else {
            System.out.println("Третье число больше других и равняется " + threeNum);
        }

    }

}





