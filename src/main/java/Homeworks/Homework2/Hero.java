package Homeworks.Homework2;

public class Hero implements HealthInterface, ManaInterface {
    private int maxHealthPoint;
    private int currentHealthPoint;
    private int maxManaPoint;
    private int currentManaPoint;
    public Hero (int maxHealthPoint, int maxManaPoint){
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;

        this.maxManaPoint = maxManaPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

    @Override
    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    @Override
    public int getMaxManaPoint() {
        return maxManaPoint;
    }

    @Override
    public int getCurrentManaPoint() {
        return currentManaPoint;
    }
}
