import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JavaGaugeTest {

  @Test
  public void testGauge() {
    assertEquals(new Double(1.0), new JavaGauge().value());
  }
}
