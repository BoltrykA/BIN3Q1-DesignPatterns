public abstract class RobotAmeliore implements Robot {
    private Robot decoratedRobot;

    public RobotAmeliore(Robot decoratedRobot){
        this.decoratedRobot = decoratedRobot;
    }

    @Override
    public int getCanon() {
        return this.decoratedRobot.getCanon();
    }

    @Override
    public int getShield() {
        return this.decoratedRobot.getShield();
    }

    @Override
    public int getFreq() {
        return this.decoratedRobot.getFreq();
    }

    @Override
    public String getName() {
        return this.decoratedRobot.getName();
    }

    @Override
    public int diffLife(int i) {
        return this.decoratedRobot.diffLife(i);
    }

    @Override
    public Robot clone() {
        Robot copy = decoratedRobot.clone();
        RobotAmeliore robotAmeliore = (RobotAmeliore) this.clone();
        robotAmeliore.decoratedRobot = copy;
        return robotAmeliore;
    }
}
