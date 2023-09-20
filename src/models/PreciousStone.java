package models;

import enums.PreciousStoneEnum;

public class PreciousStone extends Stone {
    private final PreciousStoneEnum name;
    public PreciousStone(double worth, double weight, int transparency, PreciousStoneEnum name) {
        super(worth, weight, transparency);
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n     Драгоценный камень {" +
                " Название = " + String.format("%10s", this.name.getTranslate()) +
                ", Ценность = " + String.format("%8.2f", getWorth()) +
                ", Вес = " + String.format("%8.3f", getWeight()) +
                ", Прозрачность = " + getTransparency() + "%" +
                '}';
    }
}