import com.yammer.metrics.util.RatioGauge;

public class JavaGauge extends RatioGauge {
  protected double getNumerator() { return 1.0; }
  protected double getDenominator() { return 2.0; }
  public Double value() {
    return super.value() * 2.0;
  }
}
