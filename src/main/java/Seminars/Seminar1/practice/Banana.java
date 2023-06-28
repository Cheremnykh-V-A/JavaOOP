package Seminars.Seminar1.practice;

public class Banana extends Fruit {
    public Banana(Long id, int cost, String color) {
        super(id, cost, color);
    }

    @Override
    public String toString() {
        return "Banana{" + "cost=" + cost + ", color='" + color + '\'' + '}';
    }
}
