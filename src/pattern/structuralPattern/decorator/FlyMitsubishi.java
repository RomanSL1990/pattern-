package pattern.structuralPattern.decorator;

public class FlyMitsubishi extends MitsubishiWrapper {
       public FlyMitsubishi(Car car){
        super(car);
    }

    public String fty(){
           return " еще и летающий!";
    }

    @Override
    public String drive() {
        return super.drive() + fty();
    }
}
