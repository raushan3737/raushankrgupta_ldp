package com.javapoc.advanced.lambda.hotelmanagement;

@FunctionalInterface
public interface HotelFilteringCondition {
    public boolean hotelFilteringFunction(Hotel hotel);
}



/*
     Always make sure to have only one abstract method in the interface while using the lambda expression
     else, compiler will give compilation error because, confuse in which method he should place the passed logic.

    Lambda will only work with the Functional interface
    By adding annotation it will enforce you to have only one abstract method.

    Note: The method that you're introducing & declare as an abstract those are the method must be only one.
    Not applicable for overriding the inbuilt class.
 */
