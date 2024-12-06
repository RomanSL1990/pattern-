package pattern.structuralPattern.proxy;

public class Client {
    public static void main(String[] args) {

        Car car = new ProxyCar("11111");
            car.drive();

    }
}
