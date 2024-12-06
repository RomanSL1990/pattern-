package pattern.structuralPattern.adapter;

public class AdapterLadaFactoryToCentralFactory extends CentralFactory implements LadaFactory{
    @Override
    public void createLada() {
        createCar();
    }
    @Override
    public void updateLada() {
        updateCar();
    }
    @Override
    public void sellLada() {
        sellCar();
    }
}
