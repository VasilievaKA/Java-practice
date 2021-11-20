package Main;

public class Pet {
    private String name;
    Pet (String name){
        this.name=name;
    }
    @Override
    public String toString() {
        return name;
    }
}
