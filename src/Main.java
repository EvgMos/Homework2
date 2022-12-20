public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog + 4 = " + dog);
        System.out.println("cat + 4 = " + cat);
        System.out.println("paper + 4 = " + paper);

    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 12.0;
        var cat = 7.6;
        var paper = 763793;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog - 3.5 = " + dog);
        System.out.println("cat - 1.6 = " + cat);
        System.out.println("paper - 7639 = " + paper);


    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }

    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeightBoxers = firstBoxer + secondBoxer;
        System.out.println("Обший вес боксеров: " + totalWeightBoxers + " кг.");
        var differenceBetweenBoxers = secondBoxer - firstBoxer;
        System.out.println("Разница между боксёрами: " + differenceBetweenBoxers + " кг.");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var minus = secondBoxer - firstBoxer;
        var remainder = secondBoxer % firstBoxer;
        System.out.println("Операция вычитания = " + minus);
        System.out.println("Операция остатка от деления = " + remainder);
    }

    public static void task8() {
        System.out.println("Задача 8");
        var totalTime = 640;
        var oneEmployee = 8;
        var employees = totalTime / oneEmployee;
        System.out.println("Всего работников в компании — " + employees + " человек.");
        employees = employees + 94;
        totalTime = employees * oneEmployee;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками.");

    }
}