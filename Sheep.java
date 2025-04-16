public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep() {
        this("Bahbah the Sheep");
    }

    public Sheep(String name) {
        this.legs = 4;
        this.sound = "Bahh";
        this.food = "Grass and Forbs";
        this.name = name;
    }

    @Override
    public Sheep clone() {
        return new Sheep(this.name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}
