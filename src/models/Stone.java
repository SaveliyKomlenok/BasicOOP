package models;

public abstract class Stone {
    private double worth;
    private double weight;
    private int transparency;
    public Stone(){

    }
    public Stone(double worth, double weight, int transparency) {
        this.worth = worth;
        this.weight = weight;
        this.transparency = transparency;
    }

    public double getWorth() {
        return worth;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    @Override
    public String toString(){
        return "\n Камень {" +
                ", Ценность = " + String.format("%8.2f", worth) +
                ", Вес = " + String.format("%8.3f", weight) +
                ", Прозрачность = " + transparency + "%" +
                '}';
    }
}
