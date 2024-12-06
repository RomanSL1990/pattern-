package pattern.structuralPattern.adapter;

public class LadaDepartment {
    public static void main(String[] args) {

        LadaFactory ladaFactory = new AdapterLadaFactoryToCentralFactory();

        ladaFactory.createLada();
        ladaFactory.updateLada();
        ladaFactory.sellLada();


    }
}
