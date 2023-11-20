public class RobotAmelioreVie extends RobotAmeliore {
    public RobotAmelioreVie(Robot decoratedRobot) {
        super(decoratedRobot);
    }

    @Override
    public int diffLife(int i) {
        i /= 2;
        return super.diffLife(i);
    }

}
