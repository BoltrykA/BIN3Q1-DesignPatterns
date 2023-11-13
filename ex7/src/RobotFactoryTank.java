public class RobotFactoryTank implements RobotFactory{
    // freq - / canon - / health ++ / shield +
    @Override
    public Robot creerRobot(String nom) {
        return new RobotConcret.RobotBuilder(nom)
                .freq(20)
                .canon(1)
                .shield(1)
                .build();
    }
}
