package Homeworks.Homework1;

public class Wolf extends Animals{
    public Wolf(Long id, String name, int age, String color, String livingEnvironment) {
        super(id, name, age, color, livingEnvironment);
    }
    public void voice(){
        System.out.println(getName() + " воет на луну");
    }
    public void run(){
        System.out.println(getName() + " бегает по лесу");
    }
    public void eat(int count){
        System.out.println(getName() + " ест " + count + " грамм мяса");
    }
    public void sleep(){
        System.out.println(getName() + " лёг спать");
    }
    public void lay(){
        System.out.println(getName() + " устал и лёг отдохнуть");
    }
    public void hunt(){
        System.out.println(getName() + " охотится на кролика");
    }
}
