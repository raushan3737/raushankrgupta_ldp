/*
Problem Statement: Create another class in package yourname.assignment.singleton containing a non static String member variable.
Add a static method that takes String as parameter and initialize the member variable and then return object of that class.
Add a non-static method to print the String.
 */

package assignment5.raushan.assignment.singleton;

public class PrintByStaticMethod {
    private String message;

    public PrintByStaticMethod(String message) {
        this.message = message;
    }

    public static PrintByStaticMethod messageObject(String message) {
        PrintByStaticMethod obj = new PrintByStaticMethod(message);
        return obj;
    }

    public void print() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        String data = "Welcome";
        PrintByStaticMethod obj = new PrintByStaticMethod(data);
        obj.messageObject(data);
        obj.print();
    }
}
