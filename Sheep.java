public class Sheep implements Animal {
    int legs = 4;
    String sound = "Baa";
    String food = "Grass";
    String name;

    public Sheep(String name){
        this.name = name;
    }

    @Override
    public Animal Clone(){
        return new Sheep(this.name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " says: " + sound);
    }

    @Override
    public String getType(){
        return "Sheep";
    }
}