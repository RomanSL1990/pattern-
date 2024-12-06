package pattern.structuralPattern.decorator;

public class Trace {
    public static void main(String[] args) {

        Car car = new FlyMitsubishi(new MitsubishiTuck(new Mitsubishi()));
        System.out.println(car.drive());


    }
}
