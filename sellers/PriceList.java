package be.intecbrussel.sellers;

import be.intecbrussel.eatables.MagnumType;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumStandardPrice(MagnumType type) {
        double dif = 0;
        switch (type){
            case BLACKCHOKOLATE:
                dif = 1.2;
                break;
            case ALPINENUTS:
                dif = 2;
                break;
            case MILKCHOCOLATE:
                dif = 1.5;
                break;
            case WHITECHOKOLATE:
                dif = 1.23;
                break;
            case ROMATICSTRAWBERRIES:
                dif = 2.25;
                break;
        }

        return magnumStandardPrice*dif;
    }
}
