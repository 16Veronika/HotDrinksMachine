public class BottleOfWater extends Product {

    private double volume;

    public BottleOfWater(String name, int cost, double volume) {
        super(name, cost); //из родительского
        this.volume = volume; // создаем в этом классе
    } 
    


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}