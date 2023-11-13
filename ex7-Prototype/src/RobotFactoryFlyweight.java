import java.util.HashMap;
import java.util.Map;

public class RobotFactoryFlyweight {
    private Map<String, RobotFactory> robotFactoryMap = new HashMap<>();

    public void ajouterFlyweight(String nom, RobotFactory fac){
        robotFactoryMap.put(nom, fac);
    }

    public Robot creerRobot(String nomRobot){
        return robotFactoryMap.get(nomRobot).creerRobot(nomRobot);
    }
}
