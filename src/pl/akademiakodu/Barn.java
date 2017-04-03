package pl.akademiakodu;

import java.util.ArrayList;

/**
 * Created by Lukasz Kolacz on 30.03.2017.
 */


public class Barn {

    private String barnName;
    private String barnSpecies;

    private ArrayList<Animal> animalList = new ArrayList<>();


    public Barn(String barnName, String barnSpecies) {
        this.barnName = barnName;
        this.barnSpecies = barnSpecies;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public String getBarnName() {
        return barnName;
    }

    public String getBarnSpecies() {
        return barnSpecies;
    }


    public void addAnimal(Animal animal) {

        animalList.add(animal);
    }

    public boolean deleteAnimal(Animal animal) {
        for (Animal a : animalList) {
            if (a.getName().equals(animal.getName()) && a.getSpecies().equals(animal.getSpecies()) && a.getAge() == animal.getAge()) {
                animalList.remove(a);
                return true;
            }
        }
        return false;
    }

}
