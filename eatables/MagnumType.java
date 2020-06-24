package be.intecbrussel.eatables;

public enum MagnumType {

    MILKCHOCOLATE("milkChocolate"),
    WHITECHOKOLATE("white chocolate"),
    BLACKCHOKOLATE("black chocolate"),
    ALPINENUTS("alpine nuts"),
    ROMATICSTRAWBERRIES("romantic Strawberries");

    private String type = "";

    private MagnumType(String type){this.type = type;}

    public String getType() {
        return type;
    }
}
