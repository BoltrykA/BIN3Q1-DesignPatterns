public class RobotAmelioreBouclier extends RobotAmeliore {
    public RobotAmelioreBouclier(Robot decoratedRobot) {
        super(decoratedRobot);
    }

    @Override
    public int getShield() {
        return super.getShield()*2;
    }


}
