public class RobotConcret implements Robot {
    //valeurs par défaut
    private final int health;
    private final int canonPower;
    private final int shield;
    private final int freq;
    private String name;

    private RobotConcret(RobotBuilder robotBuilder){
        this.health = robotBuilder.health;
    }




    @Override
    public int getCanon() {
        return 0;
    }

    @Override
    public int getShield() {
        return 0;
    }

    @Override
    public int getFreq() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int diffLife(int i) {
        return 0;
    }

    public static class RobotBuilder {
        private int health;
        private String name;
        private int shield;
        private int freq;
        private int canonPower;
    }
}
