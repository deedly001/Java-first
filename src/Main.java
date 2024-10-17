public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();
        sixthTask();
        seventhTask();
        eighthTask();
//        ninthTask();
//        tenthTask();
    }


    static void firstTask() {
        System.out.println("Задача 1 \n");

        long mySavings = 0;
        short totalMonths = 0;
        while (mySavings <= 2_459_000) {
            totalMonths += 1;
            mySavings += 15000;
            System.out.println("Месяц " + totalMonths + ", сумма накоплений равна " + mySavings + " рублей");
        }
        System.out.println("Для накопления 2459000 рублей при откладывании 15000 руб. в месяц, нам потребуется " + (totalMonths - 0.5) + " месяцев.");
        // сделал в двух вариантах, для наглядности
    }
//        System.out.println("Для накопления 2459000 рублей при откладывании 15000 руб. в месяц, нам потребуется " + totalMonths + " месяцев.");


//    result+=str.charAt(i);

    static void secondTask() {
        System.out.println("\nЗадача 2 \n");

        String forwardResult = "";
        String reverseResult = "";
        byte i = 1;

        while (i < 10 + 1) {
            forwardResult += i + " ";
            i++;
        }

        for (i = 10; i > 0; i--) {
            reverseResult += i + " ";
        }

        System.out.println(forwardResult + "\n" + reverseResult);
    }

    static void thirdTask() {
        System.out.println("\nЗадача 3 \n");

        int citizens = 12_000_000;
        short currentsYear = 1;
        while (currentsYear <= 10) {
            int deathsPerYear = citizens * 8 / 1000;
            int birthsPerYear = citizens * 17 / 1000;
            citizens += birthsPerYear - deathsPerYear;
            System.out.println("Год " + currentsYear + ", численность населения составляет " + citizens + " чел.");
            currentsYear++;
        }
        System.out.println("Через " + (currentsYear - 1) + " лет , численность населения составит " + citizens + " чел.");


    }

    static void fourthTask() {
        System.out.println("\nЗадача 4 \n");

        int deposit = 15000;
        short monthCounter = 0;

        while (deposit <= 12_000_000) {
            monthCounter += 1;
            double percentPerMonth = deposit * 0.07;
            deposit += percentPerMonth;
            System.out.println("Месяц " + monthCounter + ", сумма накоплений равна " + deposit + " рублей, проценты составляют " + (Math.floor(percentPerMonth * 100) / 100) + " рублей");
        }
        System.out.println("Для накопления суммы более 12 млн руб. потребуется " + monthCounter + " месяцев");
    }

    static void fifthTask() {
        System.out.println("\nЗадача 5 \n");

        int deposit = 15000;
        short monthCounter = 0;
//        byte monthMult = 6;

        while (deposit <= 12_000_000) {
            monthCounter += 1;
            double percentPerMonth = deposit * 0.07;
            deposit += percentPerMonth;
            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + ", сумма накоплений равна " + deposit + " рублей, проценты составляют " + (Math.floor(percentPerMonth * 100) / 100) + " рублей");
            } else if (deposit >= 12_000_000) {
                System.out.println("Месяц " + monthCounter + ", сумма накоплений равна " + deposit + " рублей, проценты составляют " + (Math.floor(percentPerMonth * 100) / 100) + " рублей");
            }
        }
        System.out.println("Для накопления суммы более 12 млн руб. потребуется " + monthCounter + " месяцев");
    }

    static void sixthTask() {
        System.out.println("\nЗадача 6 \n");

        int deposit = 15000;
        byte depositPeriod = (9 * 12);
        short monthCounter = 0;

        while (monthCounter <= depositPeriod) {
            monthCounter += 1;
            double percentPerMonth = deposit * 0.07;
            deposit += percentPerMonth;
            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
    }

    static void seventhTask() {
        System.out.println("\nЗадача 7 \n");

        int fridayNumber = 5;
        byte currentdate = 1;

        while (currentdate <= 31) {
            if (currentdate == fridayNumber) {
                System.out.println("Сегодня пятница, " + fridayNumber + "-е число. Необходимо подготовить отчет");
                fridayNumber += 7;
            }
            currentdate += 1;
        }

    }

    static void eighthTask() {
        System.out.println("\nЗадача 8 \n");
        // Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
        //Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления (ближайшие 100 лет).
        //Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной)
        //в качестве старта и 100 лет после в качестве завершения периода расчета.
        //В результате решения задачи в консоли должен получиться следующий результат:
        //1896
        //1975
        //2054

        short currentYear = 2024;
        int nextPeriodYear = (currentYear + 100);
        int prevPeriodYear = (currentYear - 200);

        for (int i = 0; i <= nextPeriodYear; i += 79) {
            if (i >= prevPeriodYear) {
                System.out.println(i);
            }
        }

//        short currentYear = 2024;
//        int nextPeriodYear = (currentYear + 100);
//        int prevPeriodYear = (currentYear - 200);
//        int i = 0;
//        int cometLake = 79;
//
//        while (i <= nextPeriodYear) {
//            if (i == cometLake) {
//                if ((i >= prevPeriodYear && i <= nextPeriodYear)) {
//                    System.out.println(i);
//                }
//                cometLake += 79;
//            }
//            i++;
//        }
    }

    static void ninthTask() {
        System.out.println("\nЗадача 9 \n");

    }

    static void tenthTask() {
        System.out.println("\nЗадача 10 \n");

    }
}





