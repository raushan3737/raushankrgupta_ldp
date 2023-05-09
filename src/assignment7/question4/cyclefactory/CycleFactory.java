/*
    Problem Statement: 5. Create a class with an inner class that has a non-default constructor (one that takes arguments).
    Create a second class with an inner class that inherits from the first inner class.
 */
package assignment7.question4.cyclefactory;
import assignment7.question2.cycle.Cycle;

public interface CycleFactory {
    Cycle createCycle();
}