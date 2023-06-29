package Homeworks.Homework1;

public class Cat extends Animals{
    public Cat(Long id, String name, int age, String color, String livingEnvironment){
        super(id, name, age, color, livingEnvironment);
    }

    public void voice(){
        System.out.println(getName() + ": 'Мяу!'");
    }
    public void run(){
        System.out.println(getName() + " гуляет по улице");
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
        System.out.println(getName() + " бегает за мышкой");
    }
}
