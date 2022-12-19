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
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
    }
    public static void task2() {
        System.out.println("Задание 2");
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        System.out.println(dog+4);
        System.out.println(cat+4);
        System.out.println(papper+4);
    }
    public static void task3() {
        System.out.println("Задание 3");
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        System.out.println(dog-3.5);
        System.out.println(cat-1.6);
        System.out.println(papper-7639);
    }
    public static void task4() {
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task6() {
        System.out.println("Задание 6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес боксеров равен " + totalWeight + " кг.");
        var differenceWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница в весе между боксерами равна " + differenceWeight + " кг.");

    }
    public static void task7() {
        System.out.println("Задание 7");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var differenceWeight1 = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница в весе между боксерами равна " + differenceWeight1 + " кг.");
        var differenceWeight2 = weightSecondBoxer%weightFirstBoxer;
        System.out.println("Разница в весе между боксерами равна " + differenceWeight2 + " кг.");
    }
    public static void task8() {
        System.out.println("Задание 8");
        var totalTime = 640;
        var workTime = 8;
        var numberOfWorkers = totalTime/workTime;
        System.out.println("Всего работников в компании - " + numberOfWorkers + " человек.");
        numberOfWorkers = numberOfWorkers + 94;
        totalTime = totalTime * workTime;
        System.out.println("Еси в компании робатает " + numberOfWorkers +
                " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками!");
    }
}