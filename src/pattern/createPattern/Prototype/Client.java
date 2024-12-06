package pattern.createPattern.Prototype;

public class Client {
    public static void main(String[] args) {
        Car firstCat = new Car(1,"First", true);
        firstCat.setId(2);
        System.out.println(firstCat);
        Car cloneCar = (Car) firstCat.copy();
        System.out.println(cloneCar);

        CarFactory factory = new CarFactory(firstCat);
        Car cloneCar2 = factory.cloneCar();
        System.out.println(cloneCar2);
        firstCat.setId(1);
        System.out.println(firstCat);
        System.out.println(cloneCar);
        cloneCar2.setTrunk(false);
        System.out.println(firstCat);
        System.out.println(cloneCar);
        System.out.println(cloneCar2);


    }
}
