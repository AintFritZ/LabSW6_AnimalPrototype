public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry(Sheep sheep, Cow cow, Horse horse) {
        this.sheepPrototype = sheep;
        this.cowPrototype = cow;
        this.horsePrototype = horse;
    }

    public Animal createSheep(String name) {
        return new Sheep(name);
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}
