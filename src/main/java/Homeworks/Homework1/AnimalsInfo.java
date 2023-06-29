package Homeworks.Homework1;

import java.util.List;

public abstract class AnimalsInfo{
    private final List<Animals> animalsList;

    public AnimalsInfo(){
        this.animalsList = new AnimalsList<>();
    }

    public void addAnimals(Animals animals){
        animalsList.add(animals);
    }

    public Animals getAnimals(Long id){
        for (Animals animals: animalsList){
            if (animals.getId().equals(id)){
                return animals;
            }
        }
        return null;
    }

    public List<Animals> getAnimalsList() {return animalsList;}

    @Override
    public String toString() {
        return "AnimalsInfo{" + animalsList + '}';
    }

}

