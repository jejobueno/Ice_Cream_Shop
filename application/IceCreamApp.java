package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the icecream salon!");

        PriceList priceList = new PriceList(2.50, 2, 1);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);
        IceCreamSeller iceCreamSeller = iceCreamSalon;

        Magnum magnum = iceCreamSalon.orderMagnum(MagnumType.BLACKCHOKOLATE);
        Magnum magnum1 = iceCreamSalon.orderMagnum(MagnumType.MILKCHOCOLATE);
        IceRocket iceRocket = iceCreamSalon.orderIceRocket();
        Flavor[] flavors = {Flavor.PISTACHE, Flavor.BANANA, Flavor.CHOCOLATE};
        Cone cone = iceCreamSalon.orderCone(flavors);

        Eatable[] iceCreams = {magnum,magnum1,iceRocket,cone};

        for (Eatable eatable: iceCreams){
            eatable.eat();
        }

        System.out.println("\nThe total profit is: " + iceCreamSalon.getProfit());

    }
}
