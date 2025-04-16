public class Horse implements Animal{
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse(){
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Grass and Hay";
        this.color = "Purple";

    }

    public Horse clone(){
        return new Horse(this.color);
    }

    @Override
    public void makeSound(){
        System.out.println(this.sound);
    }
    
    @Override
    public String getType(){
        return "Horse";
    }
}