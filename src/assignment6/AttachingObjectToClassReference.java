/*
Problem Statement:  Complete the previous exercise by creating objects to attach to the array of references.
*/

package assignment6;

public class AttachingObjectToClassReference {
    private InitialiseConstructorTest[] classReferenceArray;

    public AttachingObjectToClassReference() {
        classReferenceArray = new InitialiseConstructorTest[2];
        classReferenceArray[0] = new InitialiseConstructorTest("First argument");
        classReferenceArray[1] = new InitialiseConstructorTest("Second argument");
    }

    public static void main(String[] args) {
        AttachingObjectToClassReference obj = new AttachingObjectToClassReference();
    }
}
