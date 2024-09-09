
public class Main {
    public static void main(String[] args) {
        // задача 1.
        System.out.println("задача 1.\n");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Переменная dog имеет значение: " + dog);
        System.out.println("Переменная cat имеет значение: " + cat);
        System.out.println("Переменная paper имеет значение: " + paper);
        System.out.println("______________________________________\n");

        // задача 2.
        System.out.println("задача 2.\n");

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("Переменная dog имеет значение: " + dog);
        System.out.println("Переменная cat имеет значение: " + cat);
        System.out.println("Переменная paper имеет значение: " + paper);
        System.out.println("______________________________________\n");

        // задача 3.
        System.out.println("задача 3.\n");

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("Переменная dog имеет значение: " + dog);
        System.out.println("Переменная cat имеет значение: " + cat);
        System.out.println("Переменная paper имеет значение: " + paper);
        System.out.println("______________________________________\n");

        // задача 4.
        System.out.println("задача 4.\n");

        var friend = 19;
        System.out.println("Переменная friend имеет значение: " + friend);
        friend += 2;
        System.out.println("Переменная friend имеет значение: " + friend);
        friend /= 7;
        System.out.println("Переменная friend имеет значение: " + friend);
        System.out.println("______________________________________\n");

        // задача 5.

        System.out.println("задача 5.\n");

        var frog = 3.5;
        System.out.println("Переменная frog имеет значение: " + frog);
        frog *= 10;
        System.out.println("Переменная frog имеет значение: " + frog);
        frog /= 3.5;
        System.out.println("Переменная frog имеет значение: " + frog);
        frog += 4;
        System.out.println("Переменная frog имеет значение: " + frog);
        System.out.println("______________________________________\n");

        // задача 6.
        System.out.println("задача 6.\n");

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var weightBoxers = firstBoxerWeight + secondBoxerWeight;
        /* в этой задаче я бы использовал if\else, но до них пока не дошли, можно использовать функцию
        иначе выдает отрицательное значение*/
        var differenceWeightBoxers = Math.abs(firstBoxerWeight - secondBoxerWeight);
        // var differenceWeightBoxers = firstBoxer - secondBoxer;
        System.out.println("Общая масса двух бойцов = " + weightBoxers + "кг");
        System.out.println("Разницу между массами бойцов = " + differenceWeightBoxers + "кг");
        System.out.println("______________________________________\n");

        // задача 7.
        System.out.println("задача 7.\n");
        //есть ли смысл выводить две переменные если они есть в предыдущей задаче?

        var dividedWeight = firstBoxerWeight % secondBoxerWeight; // хотя можно сразу вывести в консоль
        System.out.println("Остаток от деления между двумя весами = " + dividedWeight + "кг");
        // сомневался с весом, но проверил через python и реально так получается.
        System.out.println("______________________________________\n");

        // задача 8.
        System.out.println("задача 8.1\n");

        var workingHours = 640;
        var hoursPerWorker = 8;
        var workerCount = (workingHours / hoursPerWorker);
        System.out.println("Всего работников в компании: " + workerCount + "\n");

        System.out.println("задача 8.2\n");
        workerCount += 94;
        workingHours = workerCount * 8;
        System.out.println("Если в компании работает " + workerCount + " человек, то всего " + workingHours +
                " часов работы может быть поделено между сотрудниками».");
    }

}

