package pattern.createPattern.Builder;

public class PizzaBuilder implements Builder {

    private Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }


    @Override
    public void setSize(int size) {
        pizza.setSize(size);
    }

    @Override
    public void setPrice(double price) {
        pizza.setPrice(price);
    }

    @Override
    public void setName(String name) {
        pizza.setName(name);
    }

    @Override
    public void setCheese(boolean cheese) {
        pizza.setCheese(true);
    }

    @Override
    public Pizza buildPizza() {
        return pizza;
    }


}
