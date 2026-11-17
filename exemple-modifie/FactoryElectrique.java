public class FactoryElectrique implements AbstractFactory {
    public Automobile construireAutomobile() { return new AutomobileElectrique(); }
    public Scooter construireScooter() { return new ScooterElectrique(); }
    public Camion construireCamion() { return new CamionElectrique(); }
}