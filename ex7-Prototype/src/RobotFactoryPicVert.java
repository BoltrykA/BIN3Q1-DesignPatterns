public class RobotFactoryPicVert implements RobotFactory{
    // canon - / shield - / freq ++
    @Override
    public Robot creerRobot(String nom) {
        return new RobotConcret.RobotBuilder(nom)
                .freq(20)
                .canon(1)
                .shield(1)
                .build();
    }
}
