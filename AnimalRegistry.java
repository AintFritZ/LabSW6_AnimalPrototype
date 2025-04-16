public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public Animal createSheep(String name){
        return new Sheep(name);
    }

    public Animal createCow(){
        return new cowPrototype.clone();
    }

    public Animal createHorse(){
        return new horsePrototype.clone();
    }
}