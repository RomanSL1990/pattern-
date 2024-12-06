package pattern.structuralPattern.decorator;

public class MitsubishiTuck extends MitsubishiWrapper {


    public MitsubishiTuck(Car car) {
        super(car);
    }

    public String driveOffroad(){
        return " по бездорожью";
    }

    @Override
    public String drive() {
        return super.drive() + driveOffroad();
    }
}
