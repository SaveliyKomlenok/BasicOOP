package enums;

public enum PreciousStoneEnum {
    DIAMOND("Алмаз"),
    EMERALD("Изумруд"),
    RUBY("Рубин"),
    SAPPHIRE("Сапфир"),
    PEARLS("Жемчуг");
    final String translate;
    PreciousStoneEnum(String translate){
        this.translate = translate;
    }
    public String getTranslate() {
        return translate;
    }

    @Override
    public String toString() {
        return translate;
    }
}
