package Homeworks.Homework1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Animals {
//    Поля:
    private Long id;
    protected String name;
    protected int age;
    protected String color;
    protected String livingEnvironment;

//    Методы:
    public abstract void voice();
    public abstract void run();
    public abstract void eat(int count);
    public abstract void sleep();
    public abstract void lay();
    public abstract void hunt();


}
