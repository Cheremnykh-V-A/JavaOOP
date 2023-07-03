package Homeworks.Homework2;

public class Neutral implements HealthInterface{
    private int maxHealthPoint;
    private int currentHealthPoint;
    public Neutral (int maxHealthPoint){
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }
    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    @Override
    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }
}
