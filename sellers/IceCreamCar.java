package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller{

    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Flavor[] flavors) {

        stock.setCones(stock.getCones()-1);
        stock.setBalls(stock.getBalls()-flavors.length);

            if (stock.getCones() < 0) {
                throw new NoMoreIceCreamException("There is no more cones");
            } else if (stock.getBalls() < 0) {
                throw new NoMoreIceCreamException("There is no more balls");
            } else {
                return prepareCone(flavors);
            }
    }

    public Cone prepareCone(Flavor[] flavors){
        Cone cone = new Cone(flavors);
        profit += priceList.getBallPrice() * flavors.length;
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        stock.setIceRockets(stock.getIceRockets()-1);

        if (stock.getIceRockets() < 0) {
            throw new NoMoreIceCreamException("There is no more ice rockets");
        } else {
            return prepareIceRocket();
        }
    }

    public IceRocket prepareIceRocket() {
        IceRocket iceRocket = new IceRocket();
        profit += priceList.getRocketPrice();
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        stock.setMagni(stock.getMagni()-1);
        if (stock.getMagni() < 0) {
            throw new NoMoreIceCreamException("There is no more magnums");
        } else {
            return prepareMagnum(type);
        }
    }

    public Magnum prepareMagnum(MagnumType type) {
        Magnum magnum = new Magnum(type);
        profit += priceList.getMagnumStandardPrice(type);
        return magnum;
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
