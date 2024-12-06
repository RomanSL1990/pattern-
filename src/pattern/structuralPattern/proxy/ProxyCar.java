package pattern.structuralPattern.proxy;

public class ProxyCar implements Car {

    private String serialNumber;

    private Mitsubishi mitsubishi;

    public ProxyCar(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void drive() {
        if(mitsubishi == null){
            mitsubishi = new Mitsubishi(serialNumber);
        }
        mitsubishi.drive();
    }
}
