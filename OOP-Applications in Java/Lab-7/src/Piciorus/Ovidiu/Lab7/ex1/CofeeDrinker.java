package Piciorus.Ovidiu.Lab7.ex1;

public class CofeeDrinker {
    void drinkCofee(Cofee c) throws TemperatureException, CofeesException, ConcentrationException {
        if (c.getTemp() > 60)
            throw new TemperatureException(c.getTemp(), "Cofee is to hot!");
        if (c.getConc() > 50)
            throw new ConcentrationException(c.getConc(), "Cofee concentration to high!");
        if (Cofee.getNr() > 5)
            throw new ConcentrationException(Cofee.getNr(), "To many Coffees!");
        System.out.println("Drink cofee:" + c);
    }
}
