package assignment7.question4.cyclefactory;

import assignment7.question2.cycle.Cycle;
import assignment7.question2.cycle.Unicycle;

public class UnicycleFactory implements CycleFactory {
    public Cycle createCycle() {
        return new Unicycle();
    }
}