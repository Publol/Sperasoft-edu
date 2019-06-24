package examples;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    
    
    public Animal doSimpleAnimalThing(Animal animal){
        animal.makeAThing();
        return animal;
    }
   
    
    public <V extends Animal> V doAnimalThing(V animal){
        animal.makeAThing();
        return animal;
    }
    
}
