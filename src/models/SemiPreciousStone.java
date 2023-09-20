package models;

import enums.SemiPreciousStoneEnum;

public class SemiPreciousStone extends Stone{
    private final SemiPreciousStoneEnum name;

    public SemiPreciousStone(double worth, double weight, int transparency, SemiPreciousStoneEnum name) {
        super(worth, weight, transparency);
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n Полудрагоценный камень {" +
                " Название = " + String.format("%10s", name.getTranslate()) +
                ", Ценность = " + String.format("%8.2f", getWorth()) +
                ", Вес = " + String.format("%8.3f", getWeight()) +
                ", Прозрачность = " + getTransparency() + "%" +
                '}';
    }
}