package TypewiseAlert;

public class TypewiseAlert {
    public class BatteryCharacter {
      public Datatypes.CoolingType coolingType;
      public String brand;
    }
    public static void checkAndAlert(
        Datatypes.AlertTarget alertTarget, BatteryCharacter batteryChar, double temperatureInC) {

      Datatypes.BreachType breachType = BreachDetect.classifyTemperatureBreach(
        batteryChar.coolingType, temperatureInC
      );

      switch(alertTarget) {
        case TO_CONTROLLER:
          Alerts.sendToController(breachType);
          break;
        case TO_EMAIL:
          Alerts.sendToEmail(breachType);
          break;
      }
    }
    
}
