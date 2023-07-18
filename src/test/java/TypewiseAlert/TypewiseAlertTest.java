package TypewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TypewiseAlertTest 
{
    @Test
    public void infersBreachAsPerLimits()
    {
      assertTrue(BreachDetect.inferBreach(12, 20, 30) ==
        Datatypes.BreachType.TOO_LOW);
    }
}
