package Homeworks.Homework1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Нужно создать несколько классов животных:
    1. Пес (Собака)
    2. Кот (Кошка)
    3. ... придумать еще парочку

    Каждое животное имеет: (поля)
    1. Имя (кличка)
    2. Возраст
    3. ... придумать еще какие-то параметры

    Каждое животное может: (методы)
    1. Подавать голос
    2. Питаться (съедает какое-то количество еды, переданное в метод)
    3. Двигаться
    4. ... все, что сумеете придумать

    Нужно выделить базовый тип с общими атрибутами, инкапсулировать то, что является внутренним, внурь класса.
    Создать массив с животными и в цикле заставить их поесть (какое-то количество еды) и заставить подать голос.

    Придумать свою структуру с наследованием по аналогии с животными и банковскими счетами.
     */

    public static void main(String[] args) {
        AnimalsInfo animalsInfo = new OurAnimalsInfo();
        animalsInfo.addAnimals(new Bear(1L, "Потап", 4, "коричневый", "дикий"));
        animalsInfo.addAnimals(new Cat(2L, "Барсик", 6, "белый", "домашний"));
        animalsInfo.addAnimals(new Cow(3L, "Бурёнка", 10, "белый","домашний"));
        animalsInfo.addAnimals(new Dog(4L, "Норрис", 3, "чёрный", "домашний"));
        animalsInfo.addAnimals(new Wolf(5L, "Стэтхэм", 7, "серый", "дикий"));

//        System.out.println(animalsInfo);
//        System.out.println(animalsInfo.getAnimals(5L));

        for (Animals animal: animalsInfo.getAnimalsList()){
//            animal.run();
            animal.voice();
            animal.eat(500);
//            animal.sleep();
//            animal.lay();
//            animal.hunt();
            System.out.println();
        }


    }

}
