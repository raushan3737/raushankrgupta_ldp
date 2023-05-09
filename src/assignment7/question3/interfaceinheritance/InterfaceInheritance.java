package assignment7.question3.interfaceinheritance;

public class InterfaceInheritance {
    // Method that takes Interface1 as an argument
    static void method1(Interface1 obj) {
        obj.method1();
        obj.method2();
    }

    // Method that takes Interface2 as an argument
    static void method2(Interface2 obj) {
        obj.method3();
        obj.method4();
    }

    // Method that takes Interface3 as an argument
    static void method3(Interface3 obj) {
        obj.method5();
        obj.method6();
    }

    // Method that takes CombinedInterface as an argument
    static void method4(CombinedInterface obj) {
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.newMethod();
    }

    public static void main(String[] args) {
        // Create an object of ImplementationClass
        ImplementationClass obj = new ImplementationClass();

        // Call method1 with obj
        method1(obj);

        // Call method2 with obj
        method2(obj);

        // Call method3 with obj
        method3(obj);

        // Call method4 with obj
        method4(obj);
    }
}