package Homeworks.Homework2;

public class Main {
    /*
    Предположим, вы разрабатываете какую-то компьютерную игру, в которой есть несколько типов объектов (классов):
1 - Здание (имеет текущий уровень здоровья)
2 - Герой (имеет текущий уровень здоровья и текущий уровень магической энергии)
3 - Нейтральный персонаж (имеет текущий уровень здоровья)
Примеры того, как это может выглядеть:
https://d3upx5peno0o6w.cloudfront.net/guides1png_1620826387.png
https://xgm.guru/files/100/242011/HP-Bar.png

Также у вас есть класс Render с методом showIndicator, который срабатывает при наведении мышки на объект и работает следующим образом:
1 - Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
2 - Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
В качестве упрощения, пусть вывод на дисплей это запись информации в консоль.
То есть вы пишете код, который выводит на консоль информацию.

Подсказка: нужно ввести 2 интерфейса: наличие здоровья и наличие магической энергии.
В классе Render проверять только на эти интерфейсы и выводить нужную информацию.
Необходимо продумать, какие методы должны быть в интерфейсе.
.

ЧТО ДЕЛАТЬ НЕ НУЖНО:
Нельзя завязываться на конкретные классы. Предполагается, что таких классов очень много и они постоянно добавляются.

Необязательные задания, которые не относятся к теме, но при сильном желании можно реализовать.
Со звездочкой : реализовать в консоли отображение индикатора.
Например, при максимальном уровне здоровья 100 и текущем 40 можно отобразить вот такую ленточку: [xxxx ]
С двумя звездочками : раскрасить вывод. Чем меньше здоровья, тем "краснее" цвет индикатора. Для полного здоровья - цвет зеленый.
     */

    public static void main(String[] args) {
        Render render = new Render();
        Building building = new Building(100);
        building.setCurrentHealthPoint(50);
        render.showIndicator(building);

//        Render render1 = new Render();
//        Hero hero = new Hero(100, 100);
//        hero.setCurrentHealthPoint(60);
//        hero.setCurrentManaPoint(80);
//        render1.showIndicator(hero);

//        Render render2 = new Render();
//        Neutral neutral = new Neutral(100);
//        neutral.setCurrentHealthPoint(25);
//        render2.showIndicator(neutral);

    }
}