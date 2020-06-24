package be.intecbrussel.eatables;

public class Cone implements Eatable {

    Flavor[] balls;


    public Cone(){

    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    public void eat(){

        System.out.println("You're eating a cone with:");
        for (Flavor flavor : balls) {
            System.out.println("A bal of " + flavor.getFlavor());
        }
    }

}
