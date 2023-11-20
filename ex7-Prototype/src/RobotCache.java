import java.util.Map;

public class RobotCache {
    private Map<String, Robot> robotMap;

    public void put(String nom, Robot robot){
        robotMap.put(nom,robot);
    }

    public Robot creerRobot(String nom){
        return robotMap.get(nom).clone();
    }
}
