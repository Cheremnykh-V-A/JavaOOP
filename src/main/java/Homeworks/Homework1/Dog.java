package Homeworks.Homework1;

public class Dog extends Animals{
    public Dog(Long id, String name, int age, String color, String livingEnvironment){
        super(id, name, age, color, livingEnvironment);
    }

    public void voice(){
        System.out.println(getName() + ": 'Гав-гав!'");
    }
    public void run(){
        System.out.println(getName() + " бегает по учатску");
    }
    public void eat(int count){
        System.out.println(getName() + " ест " + count + " грамм корма");
    }
    public void sleep(){
        System.out.println(getName() + " лёг спать");
    }
    public void lay(){
        System.out.println(getName() + " устал и лёг отдохнуть");
    }
    public void hunt(){
        System.out.println(getName() + " бегает за птицей");
    }
}
