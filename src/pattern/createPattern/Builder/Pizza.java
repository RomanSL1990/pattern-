package pattern.createPattern.Builder;

import java.util.Objects;

public class Pizza {

    private int size;
    private double price;
    private String name;
    private boolean cheese;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return size == pizza.size && Double.compare(price, pizza.price) == 0 && cheese == pizza.cheese && Objects.equals(name, pizza.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, price, name, cheese);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", cheese=" + cheese +
                '}';
    }
}
