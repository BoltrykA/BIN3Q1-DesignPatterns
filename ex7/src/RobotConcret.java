public class RobotConcret implements Robot {
    //valeurs par défaut
    private int health = 100;
    private final int canonPower = 1;
    private final int shield = 1;
    private final int freq = 100;
    private String name;

    private RobotConcret(){

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

    }
}
