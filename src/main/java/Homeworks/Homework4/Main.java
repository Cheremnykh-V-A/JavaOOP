package Homeworks.Homework4;

public class Main {
    /*
    Есть класс Фрукта. У фрукта есть вес.
    Есть 3 наследника: апельсин, яблоко и золотое яблоко.
    Нужно создать класс "Коробка с фруктами", в которую можно класть фрукты какого-то типа.
    После создания коробка пустая. В нее можно добавлять фрукты с помощью метода add().
    У коробки можно узнать сумарный вес с помощью метода getWeight().
    Содержимое коробки можно пересыпать в другую коробку. При этом исходная коробка очищается, а вторая наполняется.
     */
    public static void main(String[] args) {
//        Box<String> stringBox = new Box<>(); // не должно компилироваться

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(1));
        orangeBox.add(new Orange(2));
//        orangeBox.add(new Apple(2));       // не должно компилироваться
//        orangeBox.add(new GoldenApple(2)); // не должно компилироваться

        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight()); // 3

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(1));
        appleBox.add(new GoldenApple(2)); // допустимый вариант
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight()); // 3

        Box<Apple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new GoldenApple(5)); // допустимый вариант
//        goldenAppleBox.add(new Apple(5));       // не должно компилироваться
        System.out.println("Вес коробки с золотыми яблоками: " + goldenAppleBox.getWeight()); // 5
        System.out.println();
        System.out.println("Золотые яблоки пересыпали в коробку с яблоками");
        goldenAppleBox.moveTo(appleBox); // допустимый вариант
        System.out.println("Вес коробки с золотыми яблоками: " + goldenAppleBox.getWeight()); // 0
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight()); // 8
//        appleBox.moveTo(goldenAppleBox); // не должно компилироваться
//        orangeBox.moveTo(appleBox);      // не должно компилироваться

        System.out.println();
        System.out.println("Апельсины пересыпали в другую коробку");
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox.moveTo(orangeBox2);
        System.out.println("Вес первой коробки с апельсинами: " + orangeBox.getWeight()); // 0
        System.out.println("Вес второй коробки с апельсинами: " + orangeBox2.getWeight()); // 3
    }
}
