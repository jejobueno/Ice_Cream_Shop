package be.intecbrussel.eatables;

public enum Flavor {

    STRAWBERRY("strawberry"),
    BANANA("banana"),
    CHOCOLATE("chocolate"),
    VANILLA("vanilla"),
    LEMON("lemon"),
    STRACIATELLA("straciatella"),
    MOKKA("mokka"),
    PISTACHE("pistache");

    private String flavor = "";

    private Flavor(String flavor){ this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}
