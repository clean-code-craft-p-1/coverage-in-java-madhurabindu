package TypewiseAlert;

import TypewiseAlert.Datatypes.BreachType;
import TypewiseAlert.Datatypes.CoolingType;

public class BreachDetect {
    public static BreachType inferBreach(double value, double lowerLimit, double upperLimit) {
      if(value < lowerLimit) {
        return BreachType.TOO_LOW;
      }
      if(value > upperLimit) {
        return BreachType.TOO_HIGH;
      }
      return BreachType.NORMAL;
    }
    
    public static BreachType classifyTemperatureBreach(
      CoolingType coolingType, double temperatureInC) {
      int lowerLimit = 0;
      int upperLimit = 0;
      switch(coolingType) {
        case PASSIVE_COOLING:
          lowerLimit = 0;
          upperLimit = 35;
          break;
        case HI_ACTIVE_COOLING:
          lowerLimit = 0;
          upperLimit = 45;
          break;
        case MED_ACTIVE_COOLING:
          lowerLimit = 0;
          upperLimit = 40;
          break;
      }
      return inferBreach(temperatureInC, lowerLimit, upperLimit);
    }
}
