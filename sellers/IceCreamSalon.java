package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller{

    private PriceList priceList;
    private double totalProfit;

    public double getProfit() {
        return totalProfit;
    }

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Flavor[] flavors) {
        Cone cone = new Cone(flavors);
        totalProfit += priceList.getBallPrice()*flavors.length;
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalProfit += priceList.getRocketPrice();
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        Magnum magnum = new Magnum(type);
        totalProfit += priceList.getMagnumStandardPrice(type);
        return magnum;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
