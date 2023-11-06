public class RobotConcret implements Robot {
    //valeurs par défaut
    private final int health;
    private final int canon; //canonPower
    private final int shield;
    private final int freq;
    private final String name;

    private RobotConcret(RobotBuilder robotBuilder){
        this.health = robotBuilder.health;
        this.canon = robotBuilder.canon;
        this.shield = robotBuilder.shield;
        this.freq = robotBuilder.freq;
        this.name = robotBuilder.name;
    }


    @Override
    public int getCanon() {
        return canon;
    }

    @Override
    public int getShield() {
        return shield;
    }

    @Override
    public int getFreq() {
        return freq;
    }

    @Override
    public String getName() {
        return name;
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
        private int canon; //canonPower

        public RobotBuilder setHealth(int health) {
            this.health = health;
            return this;
        }

        public RobotBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public RobotBuilder setShield(int shield) {
            this.shield = shield;
            return this;
        }

        public RobotBuilder setFreq(int freq) {
            this.freq = freq;
            return this;
        }

        public RobotBuilder setCanon(int canon) {
            this.canon = canon;
            return this;
        }
    }
}
