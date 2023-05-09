package assignment7.question2.cycle;


public class CycleTest {
    public static void main(String[] args) {
        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};

        for (Cycle cycle : cycles) {
            // Uncommenting the following line will result in a compile-time error
            // cycle.balance();
            // Calling ride() method on each element of the array
            cycle.ride();

            // Calling balance() method on each element of the array
            if (cycle instanceof Unicycle) {
                Unicycle uniCycle = (Unicycle) cycle;
                uniCycle.balance();
            } else if (cycle instanceof Bicycle) {
                Bicycle biCycle = (Bicycle) cycle;
                biCycle.balance();
            } else {
                System.out.println("Tricycle doesn't have balance method.");
            }
        }
    }
}
