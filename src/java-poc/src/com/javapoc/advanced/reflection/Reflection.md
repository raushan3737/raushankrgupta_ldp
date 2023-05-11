    Reflection in Java: is a feature allows us to inspect and manipulate classes,interfaces,constructors,methods, & fields at run time.

        The required classes for reflection are provided under java.lang.reflect package which is essential in order to understand reflection .

        Diagram: Unknown Object => Reflection API => Modify behaviour of methods,classes,interface at runtime.

        #### The Reflected copy of any class is a nothing but a class class object

Reflection of Java Classes: In order to reflect a java class, we first need to create an object of class.

        And, using the object we can call various methods to get information about methods,fields, and constructors present in class.

        There exists three ways to create objects of class.

        1. Using forName() method(To load dynamic class ):

class Person{}

    // Create object of Class

// To reflect the Person class
Class a = Class.forName("Person"); // Will get the object b with the behaviour of Class Person at run time.

2. Using getClass() method (To load the static class ):

class Person{}
// Creates an object of Person class
Person p1 = new Person();

    Class b = p1.getClass();  // Will get the object b with the behaviour of Class Person at run time.

3. Using .class extension:

class Person{}

    Class c = Person.class;

#.Code to demonstrate Reflection:

class Person{
public void show(){

    }

}

public class ReflectionDemo{

    Person p = new Person();
    // Now c will hold all the info. of p object of  class Person
    Class c = p.getClass();

}


