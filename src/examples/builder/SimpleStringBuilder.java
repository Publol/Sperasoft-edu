package examples.builder;

public class SimpleStringBuilder {
    
    
    private String value;
    
    public SimpleStringBuilder() {
        this.value = "I like next things: ";
    }
    
    public SimpleStringBuilder addHuman(){
        this.value = this.value.concat(" Humans! ");
        return this;
    }
    
    public SimpleStringBuilder addDonuts(){
        this.value = this.value.concat(" Donuts!");
        return this;
    }
    
    public SimpleStringBuilder addCat(){
        this.value = this.value.concat(" My cat! ");
        return this;
    }
    
    
}
