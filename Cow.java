public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Grass and Hay";
    }

    @Override
    public Cow clone() {
        return new Cow(); 
    }

    @Override
    public void makeSound() {
        System.out.println(this.sound);
    }

    @Override
    public String getType() {
        return "Cow"; 
    }
}
