package TypewiseAlert;

public class Datatypes {
    public enum AlertTarget{
        TO_CONTROLLER,
        TO_EMAIL
      };

      public enum BreachType {
        NORMAL,
        TOO_LOW,
        TOO_HIGH
      };
      public enum CoolingType {
        PASSIVE_COOLING,
        HI_ACTIVE_COOLING,
        MED_ACTIVE_COOLING
      };
}
