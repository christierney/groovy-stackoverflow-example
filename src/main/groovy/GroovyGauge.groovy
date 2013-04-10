import com.yammer.metrics.util.RatioGauge

class GroovyGauge extends RatioGauge {
  protected double getNumerator() { 1.0 }
  protected double getDenominator() { 2.0 }
  public Double value() {
    super.value() * 2.0
  }
}
