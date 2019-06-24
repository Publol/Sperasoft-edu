package examples;

public class Dog extends Animal {


    @Override
    public void makeAThing() {
        doDogThings();
    }

    public void doDogThings(){
        System.out.println("I'm a dog! woof!");
    }
    
}
