public class RobotConcret implements Robot {
    //valeurs par défaut

    private int health;
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

    public int getHealth() {
        return health;
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
        this.health = health + (i);
        return health;
    }

    @Override
    public Robot clone() {
        try {
            return (Robot) super.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    public static class RobotBuilder {
        private int health = 100;
        private String name;
        private int shield = 1;
        private int freq = 100;
        private int canon = 1; //canonPower

        public RobotBuilder(String name){
            this.name = name;
        }

        public RobotBuilder health(int health) {
            this.health = health;
            return this;
        }

        public RobotBuilder name(String name) {
            this.name = name;
            return this;
        }

        public RobotBuilder shield(int shield) {
            this.shield = shield;
            return this;
        }

        public RobotBuilder freq(int freq) {
            this.freq = freq;
            return this;
        }

        public RobotBuilder canon(int canon) {
            this.canon = canon;
            return this;
        }
        public Robot build(){
            return new RobotConcret(this);
        }
    }
}
