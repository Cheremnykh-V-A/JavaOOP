package Seminars.Seminar1.practice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Fruit {
    private Long id;
    protected int cost;
    protected String color;
}
