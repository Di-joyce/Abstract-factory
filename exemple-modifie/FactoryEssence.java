public class FactoryEssence implements AbstractFactory {
    public Automobile construireAutomobile() { return new AutomobileEssence(); }
    public Scooter construireScooter() { return new ScooterEssence(); }
    public Camion construireCamion() { return new CamionEssence(); }
}