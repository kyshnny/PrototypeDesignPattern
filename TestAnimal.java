public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Going Merry");
        sheep1.makeSound();

        Animal cow1 = registry.createCow();
        cow1.makeSound();

        Animal horse1 = registry.createHorse("Blue");
        horse1.makeSound();
    }
}