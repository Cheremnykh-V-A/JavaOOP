package Homeworks.Homework3;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Comparable<Container>, Iterable<Box>{
    private List<Box> boxes;

    public Container(){
        this.boxes = new ArrayList<>();
    }

    public void addBox(Box box){
        boxes.add(box);
    }

    public int getTotalWieght(){
        int totalWeght = 0;
        for (Box box: boxes){
            totalWeght += box.getWeight();
        }
        return totalWeght;
    }

    public int getTotalBoxCount(){
        return boxes.size();
    }

    @Override
    public int compareTo(Container o) {
        return Integer.compare(this.getTotalWieght(), o.getTotalWieght());
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}
