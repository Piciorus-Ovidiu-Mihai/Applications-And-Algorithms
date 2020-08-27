package Piciorus.Ovidiu.Lab7.ex1;



public class CoffeTest {
    public static void main(String[] args) {
        CofeeMaker mk = new CofeeMaker();
        CofeeDrinker d = new CofeeDrinker();

        for (int i = 0; i < 15; i++) {
            Cofee c = mk.makeCofee();
            try {
                d.drinkCofee(c);
            } catch (TemperatureException e) {
                System.out.println("Exception:" + e.getMessage() + " temp=" + e.getTemp());
            } catch (ConcentrationException e) {
                System.out.println("Exception:" + e.getMessage() + " conc=" + e.getConc());
            }catch (CofeesException e) {
                System.out.println("Exception:" + e.getMessage() + " No.:" + e.getNr());
            }
            finally {
                System.out.println("Throw the cofee cup.\n");
            }
        }
    }
}
