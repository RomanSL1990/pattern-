package patternProectirovaniyaPorojaysie.FactoryMetod;

public class Client {
    public static void main(String[] args) {

        System.out.println(new MitsubishiDepartment().crateCar());
        System.out.println(new LadaDepartment().crateCar());

    }
}
