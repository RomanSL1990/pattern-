package pattern.createPattern.Builder;

public class Main {
    public static void main(String[] args) {

        Builder builder = new PizzaBuilder();
        BuilderCar builderCar = new CarBuilder();
        Manager manager = new Manager(builder);
        Zavod zavod = new Zavod(builderCar);

        zavod.createBuss();
        System.out.println(builderCar.buildCar().hashCode());
        zavod.createSportCar();
        System.out.println(builderCar.buildCar().hashCode());

        manager.createDefaultPizza();
        System.out.println(builder.buildPizza().hashCode());

        manager.createCheesePizza();
        System.out.println(builder.buildPizza().hashCode());




    }
}
