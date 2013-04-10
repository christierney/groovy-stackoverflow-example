import groovy.util.GroovyTestCase

class GroovyGaugeTest extends GroovyTestCase {

  void testGauge() {
    assert new GroovyGauge().value() == 1.0
  }
}
