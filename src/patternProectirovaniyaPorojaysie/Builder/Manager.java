package patternProectirovaniyaPorojaysie.Builder;

import java.util.Date;

public class Manager {
    Builder builder;

    Manager(Builder builder){
        this.builder = builder;
    }

    public void createDefaultPizza(){
        builder.setName("Just pizza");
        builder.setPrice(150);
        builder.setSize(6);
    }

    public void createCheesePizza(){
        builder.setName("Cheese pizza");
        builder.setPrice(350);
        builder.setSize(30);
        builder.setCheese(true);
    }



}
