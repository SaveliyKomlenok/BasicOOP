package enums;

public enum SemiPreciousStoneEnum {
    OPAL("Опал"), AGATE("Агат"), GARNET("Гранат"), TURQUOISE("Бирюза"), AMBER("Амбер");
    final String translate;
    SemiPreciousStoneEnum(String translate){
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
