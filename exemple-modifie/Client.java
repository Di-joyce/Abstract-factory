public class Client {
    public static void main(String[] args) {
        AbstractFactory factoryEssence = new FactoryEssence();
        AbstractFactory factoryElectrique = new FactoryElectrique();

        System.out.println("Fabrique Essence");
        factoryEssence.construireAutomobile().methodeAutomobile();
        factoryEssence.construireScooter().methodeScooter();

        System.out.println("Fabrique Electrique");
        factoryElectrique.construireAutomobile().methodeAutomobile();
        factoryElectrique.construireScooter().methodeScooter();
    }
}