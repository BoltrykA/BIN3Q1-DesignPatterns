public class RobotFactoryGrosseBerta implements RobotFactory {
    // freq - / puissance +
    @Override
    public Robot creerRobot(String nom) {
        return new RobotConcret.RobotBuilder(nom)
                .freq(3)
                .canon(15)
                .build();
    }
}
