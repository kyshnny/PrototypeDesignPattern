public class Cow implements Animal {
    int legs = 4;
    String sound = "Moo";
    String food = "Grass";

    @Override
    public Animal Clone(){
        return new Cow();
    }

    @Override
    public void makeSound(){
        System.out.println("Cow says: " + sound);
    }

    @Override
    public String getType(){
        return "Cow";
    }
}