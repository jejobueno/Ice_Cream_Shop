
package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        System.out.println("Welcome to the icecream car!\n");
        PriceList priceList = new PriceList(2.50, 2, 1);
        Stock stock = new Stock(1,2,4,3);
        IceCreamCar iceCreamCar = new IceCreamCar(priceList,stock);
        IceCreamSeller iceCreamSeller = iceCreamCar;

        Eatable[] iceCreams = new Eatable[4];

        Magnum magnum = iceCreamSeller.orderMagnum(MagnumType.BLACKCHOKOLATE);
        Magnum magnum1 = iceCreamSeller.orderMagnum(MagnumType.MILKCHOCOLATE);
        IceRocket iceRocket = iceCreamSeller.orderIceRocket();
        Flavor[] flavors = {Flavor.PISTACHE, Flavor.BANANA, Flavor.CHOCOLATE};
        Cone cone = iceCreamSeller.orderCone(flavors);

        iceCreams = new Eatable[]{magnum, magnum1, iceRocket, cone};

        for (Eatable eatable: iceCreams){
            eatable.eat();
        }

        try {
            IceRocket iceRocket1 = iceCreamSeller.orderIceRocket();
            iceRocket1.eat();

        } catch (NoMoreIceCreamException nmic){
            nmic.printStackTrace();

        } finally {
            System.out.println("The total profit of the icecream car is: " + iceCreamSeller.getProfit());
        }
    }
}

