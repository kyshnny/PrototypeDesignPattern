import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {
    private Map<String, Animal> prototypes = new HashMap<>();

    public AnimalRegistry() {
        prototypes.put("Sheep", new Sheep("Default"));
        prototypes.put("Cow", new Cow());
        prototypes.put("Horse", new Horse("Default"));
    }

    public Animal createSheep(String name) {
        return new Sheep(name).Clone();
    }

    public Animal createCow() {
        return prototypes.get("Cow").Clone();
    }

    public Animal createHorse(String color) {
        return new Horse(color).Clone();
    }
}