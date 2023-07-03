package Seminars.Seminar2;

import java.io.Serializable;

public class Dolphin implements TestInterface, Swimming, Serializable, Cloneable {
    @Override
    public void swim() {
        System.out.println("Дельфин плывет");
    }

    @Override
    public void sayHello() {
        Swimming.super.sayHello();
    }

    @Override
    public void test() {
        System.out.println("One more method");
    }

    public Dolphin clone(){
        try {
            return (Dolphin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
