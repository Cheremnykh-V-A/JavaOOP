package Homeworks.Homework3;

public class Main {
    /*
    Создать класс Контейнер - Container.
    В контейнере могут быть ящики (класс Box).

    У каждого ящика есть вес.
    У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков, которые находятся в контейнере.

    Класс Контейнер должен быть Comparable. Сравнивать он должен по весам контейнера (чем меньше вес, тем меньше контейнер).
    Класс ContainerCountComparator - Comparator, который сравнивает контейнеры по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
    Класс контейнер должен быть Iterable - итерирование должно происходить по ящикам внутри контейнера.

    Container c = new Container(...);
    // ...
    for (Box box: c) {
    box - это контейнер
    }
     */

    public static void main(String[] args) {
        Container container = new Container();

        container.addBox(new Box(9));
        container.addBox(new Box(5));
        container.addBox(new Box(3));
        container.addBox(new Box(2));
        container.addBox(new Box(4));

        System.out.println("Общий вес контейнеров = " + container.getTotalWieght());
        System.out.println();

        // Перебор ящиков в контейнере:
        int boxNumber = 1;
        for (Box box: container){
            System.out.println("Вес ящика " + boxNumber + ": " + box.getWeight());
            boxNumber++;
        }

        System.out.println("\nКонтейнер №1 содержит ящики 1 и 2");
        System.out.println("Контейнер №2 содержит ящики 3, 4 и 5");

        // Сравнение контейнеров по весу:
        Container container1 = new Container();
        container1.addBox(new Box(9));
        container1.addBox(new Box(5));

        Container container2 = new Container();
        container2.addBox(new Box(3));
        container2.addBox(new Box(2));
        container2.addBox(new Box(4));

        int weightComparison = container1.compareTo(container2);
        if (weightComparison < 0){
            System.out.println("\nКонтейнер №1 легче контейнера №2");
        }
        if (weightComparison > 0){
            System.out.println("\nКонтейнер №1 тяжелее контейнера №2");
        }
        if (weightComparison == 0){
            System.out.println("\nКонтейнеры весят одинаково");
        }

        // Сравнение контейнеров по количеству ящиков:
        ContainerCountComparator comparator = new ContainerCountComparator();

        int countComparison = comparator.compare(container1, container2);
        if (countComparison < 0){
            System.out.println("\nВ контейнере №1 ящиков меньше, чем в контейнере №2");
        } else if (countComparison > 0) {
            System.out.println("\nВ контейнере №1 ящиков больше, чем в контейнере №2");
        } else {
            System.out.println("\nЯщиков в контейнерах одинаковое количество");
        }


    }

}
