package Homeworks.Homework1;

public class Cow extends Animals{
    public Cow(Long id, String name, int age, String color, String livingEnvironment){
        super(id, name, age, color, livingEnvironment);
        }
    public void voice(){
        System.out.println(getName() + " мычит");
    }
    public void run(){
        System.out.println(getName() + " пасётся на поле");
    }
    public void eat(int count){
        System.out.println(getName() + " ест " + count + " грамм сена");
    }
    public void sleep(){
        System.out.println(getName() + " легла спать");
    }
    public void lay(){
        System.out.println(getName() + " устала и легла отдохнуть");
    }
    public void hunt() {
        System.out.println(getName() + " Корова не охотится");
    }
}
