package pattern.structuralPattern.proxy;

public class Mitsubishi  implements Car{

    private String serialNumber;

    public Mitsubishi(String serialNumber) {
        this.serialNumber = serialNumber;
        sell();
    }

    public void sell(){
        System.out.println("Продана Mitsubishi с сериный номером " + serialNumber);
    }


    @Override
    public void drive() {
        System.out.println("Mitsubishi с сериный номером " + serialNumber + " уехала");
    }
}
