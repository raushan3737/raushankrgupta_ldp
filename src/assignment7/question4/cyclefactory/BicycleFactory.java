package assignment7.question4.cyclefactory;

import assignment7.question2.cycle.Bicycle;
import assignment7.question2.cycle.Cycle;

public class BicycleFactory implements CycleFactory {
    public Cycle createCycle() {
        return new Bicycle();
    }
}
