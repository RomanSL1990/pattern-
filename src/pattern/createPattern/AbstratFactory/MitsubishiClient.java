package pattern.createPattern.AbstratFactory;

import pattern.createPattern.AbstratFactory.MitsubishiDeportament.MitsubishiTeamFactory;

public class MitsubishiClient {
    public static void main(String[] args) {

        CarTeamFactory teamFactory = new MitsubishiTeamFactory();
        System.out.println(teamFactory.getEngineer().createCar());
        System.out.println(teamFactory.getWorker().buildCar());
        System.out.println(teamFactory.getManager().sellCar()
        );


    }
}
