public class RobotAmelioreCanon extends RobotAmeliore{
    public RobotAmelioreCanon(Robot decoratedRobot) {
        super(decoratedRobot);
    }

    @Override
    public int getCanon() {
        return super.getCanon()*2;
    }

}
