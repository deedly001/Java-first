
public class Main {
    public static void main(String[] args) {
        // задача 1.
        System.out.println("задача 1.\n");

        int firstNumber = 147;
        byte secondNumber = 35;
        short thirdNumber = 327;
        long fourNumber = 337203647;
        float fiveNumber = 8.6f;
        double sixNumber = 0.5;

        System.out.println("«Значение переменной firstNumber с типом int равно " + firstNumber + "».");
        System.out.println("«Значение переменной secondNumber с типом byte равно " + secondNumber + "».");
        System.out.println("«Значение переменной thirdNumber с типом short равно " + thirdNumber + "».");
        System.out.println("«Значение переменной fourNumber с типом long равно " + fourNumber + "».");
        System.out.println("«Значение переменной fiveNumber с типом float равно " + fiveNumber + "».");
        System.out.println("«Значение переменной sixNumber с типом double равно " + sixNumber + "».\n");


        // задача 2.
        System.out.println("задача 2.\n");

        float numberA = 27.12f;
        long numberB = 987678965549L;
        float numberC = 2.786f;
        short numberD = 569;
        short numberE = -159;
        short numberF = 27897;
        byte numberg = 67;

        System.out.println(numberA);
        System.out.println(numberB);
        System.out.println(numberC);
        System.out.println(numberD);
        System.out.println(numberE);
        System.out.println(numberF);
        System.out.println(numberg);

        // задача 3.
        System.out.println("задача 3.\n");

        byte firstStudentsClass = 23;
        byte secondStudentsClass = 27;
        byte thirdStudentsClass = 30;
        short purchasedTotal = 480;
        int paperPerStudent = purchasedTotal / (firstStudentsClass + secondStudentsClass + thirdStudentsClass);

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.\n");


        // задача 4.
        System.out.println("задача 4.\n");

        byte efficiencyPerMin = 16 / 2;
        byte twentyMin = 20;
        short dayHours = 60 * 24;
        int threeDaysHours = dayHours * 3;
        int monthHours = dayHours * 30;

        System.out.println("За 20 мин машина произвела " + (twentyMin * efficiencyPerMin) + " штук бутылок.");
        System.out.println("За сутки машина произвела " + (dayHours * efficiencyPerMin) + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + (threeDaysHours * efficiencyPerMin) + " штук бутылок.");
        System.out.println("За месяц машина произвела " + (monthHours * efficiencyPerMin) + " штук бутылок.\n");

        // задача 5.
        System.out.println("задача 5.\n");

        byte paintPots = 120;
        int totalClasses = paintPots / 6;
        int whitePaint = totalClasses * 2;
        int brownPaint = totalClasses * 4;

        System.out.println("В школе, где " + totalClasses + "классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.\n");


        // задача 6.
        System.out.println("задача 6.\n");

        /*
        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
         */

        byte bananaGrams = 80;
        byte milkGrams = 105;
        byte ice_creamGrams = 100;
        byte eggGrams = 70;
        char bananaCount = 5;
        char milkCount = 2;
        char ice_creamCount = 2;
        char eggCount = 4;
        int mixedBreakfast = (bananaGrams * bananaCount) + (milkGrams * milkCount) + (ice_creamGrams * ice_creamCount) + (eggGrams * eggCount);

        System.out.println("Вес такого спорт-завтрака в граммах: " + mixedBreakfast + " грамм," + "вес в килограммах: " + mixedBreakfast / 1000f + " килограмма.\n");


        // задача 7.
        System.out.println("задача 7.\n"); // над названиями переменных можно сидеть часами...

        byte weightLose = 7;
        int oneQuarter = (weightLose * 1000) / 250;
        int oneHalf = (weightLose * 1000) / 500;
        int averageWeightLoss = (oneQuarter + oneHalf) / 2;

        System.out.println("Если спортсмен будет терять каждый день по 250 грамм потребуется " + oneQuarter + " дней.");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм потребуется " + oneHalf + " дней.");
        System.out.println("Потребуется дней в среднем, чтобы добиться результата похудения: " + averageWeightLoss + " дней.\n");


        // задача 8.
        System.out.println("задача 8\n");

        int mariaSalary = 67760;
        int denisSalary = 83690;
        int christinaSalary = 76230;
        long mariaSalaryInc = (mariaSalary / 10);
        long denisSalaryInc = denisSalary / 10;
        long christinaSalaryInc = christinaSalary / 10;

        System.out.println("Маша получала до повышения зарплаты: " + mariaSalary + " рублей.");
        System.out.println("Маша теперь получает " + (mariaSalary + mariaSalaryInc) + " рублей. Годовой доход вырос на " + mariaSalaryInc + " рублей.");
        System.out.println("Денис получал до повышения зарплаты: " + denisSalary + " рублей.");
        System.out.println("Денис теперь получает " + (denisSalary + denisSalaryInc) + " рублей. Годовой доход вырос на " + denisSalaryInc + " рублей.");
        System.out.println("Кристина получала до повышения зарплаты: " + christinaSalary + " рублей.");
        System.out.println("Кристина теперь получает " + (christinaSalary + christinaSalaryInc) + " рублей. Годовой доход вырос на " + christinaSalaryInc + " рублей.");

    }

}





