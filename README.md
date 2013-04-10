This project demonstrates a bug involving calling a super method on an abstract
class. It contains a java and a groovy implementation of a concrete class
extending the yammer-metrics `RatioGauge`. Calling `value()` on the groovy
version gives a `StackOverflowException` while the java version does not.

To run:

    gradle build


