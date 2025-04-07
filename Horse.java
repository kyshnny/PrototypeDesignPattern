public class Horse implements Animal {
    int legs = 4;
    String sound = "Nee";
    String food = "Grass";
    String color;

    public Horse(String color){
        this.color = color;
    }

    @Override
    public Animal Clone() {
        return new Horse(this.color);
    }

    @Override
    public void makeSound() {
        System.out.println("Horse says: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}