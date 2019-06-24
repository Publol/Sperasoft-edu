package examples;

import examples.builder.*;

public class Main {
    
    
    public static void main(String[] args) {
        Example1 example1 = new Example1();
        
        example1.getSum(2.5, 3.5);
        example1.getSum("String1", "String2");
        example1.getSum(1, 2);
        
        example1.getSum((float)2.3, (float)4);
        
        
        
        Dog dog = new Dog();
        
        Example2 example2 = new Example2();
        Animal dog1 = example2.doSimpleAnimalThing(dog);
        //Animal dog1 = (Dog)example2.doSimpleAnimalThing(dog);
        Dog dog2 = example2.doAnimalThing(dog);
        
        
        SimpleStringBuilder builder = new SimpleStringBuilder();
        builder.
                addHuman().
                addDonuts().
                addCat();

        BuilderInterfaceImpl builderInterfaceImpl = new BuilderInterfaceImpl();
        GenericBuilder<String, BuilderInterfaceImpl> genericBuilder = new GenericBuilder<>(builderInterfaceImpl);
        genericBuilder
                .addToWishlist("Car")
                .addSign("Lada")
                .build();


        BuilderInterfaceSecondImpl builderInterfaceSecondImpl = new BuilderInterfaceSecondImpl();
        GenericBuilder<Integer, BuilderInterfaceSecondImpl> secondGenericBuilder = new GenericBuilder<>(builderInterfaceSecondImpl);
        
        secondGenericBuilder
                .addToWishlist(10)
                .addSign(15)
                .build();

    }
    
}
