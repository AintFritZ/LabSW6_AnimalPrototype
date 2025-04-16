public class TestAnimal {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Bahbah the Sheep");
        Cow cow = new Cow();
        Horse horse = new Horse("Purple");

        AnimalRegistry registry = new AnimalRegistry(sheep, cow, horse);

        Animal sheep1 = registry.createSheep("Blacky");
        Animal cow1 = registry.createCow();
        Animal horse1 = registry.createHorse();

        sheep1.makeSound();  
        cow1.makeSound();    
        horse1.makeSound();  
    }
}
