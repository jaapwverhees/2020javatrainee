package human;

public class Android extends Human implements ChargeAble {

    private int Charge;

    @Override
    public String greeting() {
        return String.format("I'm half human, my Energy Level is %s", this.Charge);
    }

    @Override
    public int charge(int amount) {
        Charge = Charge + amount;
        if(Charge > 100) Charge = 100;
        return this.Charge;
    }
}
