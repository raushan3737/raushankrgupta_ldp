package com.javapoc.advanced.lambda.hotelmanagement;

import java.util.List;

public class Main {
    private int id;

    public List<Hotel> testLambda() {
        HotelService hotelService = new HotelService();
        int PRICE = 2000; // Here, by default it has a final type
        HotelFilteringCondition lambdaExpForFilter = hotel -> {
            //   this.id = 20 ; // is accessible here & associated only with Main class
            //   PRICE++ ; // Not allowed to modify the local variable
            return hotel.getPricePerNight() <= PRICE;
        };
        //  PRICE++;  // Not allowed because, lambda body using PRICE , PRICE is of type final
        return hotelService.filteredHotels(lambdaExpForFilter);
    }

    public static void main(String[] args) {
        /*
        // Passing function as a parameter to the another function
            HotelService hotelService = new HotelService();
            List<Hotel> hotels = hotelService.filteredHotels(new FilterHotelLessThanRating());
            System.out.println("List of hotels less than rating: " + hotels);
         */

        /*
        // With the help of inner anonymous class we don't need to create class file separately.
        HotelService hotelService = new HotelService();
        List<Hotel> fiveStarHotels = hotelService.filteredHotels(new HotelFilteringCondition() {
            @Override
            public boolean hotelFilteringFunction(Hotel hotel) {
                return hotel.getHotelType() == HotelType.FIVE_STAR;
            }
        });
        System.out.println(fiveStarHotels);
         */

        /*

        // Passing the function using lambda expression
        HotelService hotelService = new HotelService();
        List<Hotel> hotels = hotelService.filteredHotels((hotel) -> {
            // Filtering logic which we want to pass to other method
            return hotel.getPricePerNight() <= 2000;
        });
        System.out.println(hotels);
         */

        // Passing the function using lambda expression
        HotelService hotelService = new HotelService();
        // We can store the reference to the lambda expression in the Interface which have the function which we are passing
        HotelFilteringCondition lambdaExpForFilter = hotel -> hotel.getPricePerNight() <= 2000;
        List<Hotel> hotels = hotelService.filteredHotels(lambdaExpForFilter);
        System.out.println(hotels);
    }
}



/*
Process to pass the function without using lambdas:
    1. Create an interface
    2. Instantiate a class that implements the interface
    3.Implement the method of the interface, where the method body = function body which you wanted to pass as parameter
    4.Pass an object of the concrete class implementation of the interface.

    Internally, lambda expression converts in the anonymous inner class.

    this & local variables in lambda class:
    this: Context of this keyword is not associated with that anonymous inner class, it is associated only with class in which the lambda expression is written
    (i.e.Here,  this is only associated with Main class)

    Local variable inside a lambda expression is by default final.





    Rules for parameter:
    1. While passing the parameter it is not necessary to pass the type, compiler will infer those.
    2. If we are adding the final keyword then, inferring the type will not work we have to pass the type
        Ex:  List<Hotel> hotels = hotelService.filteredHotels((final Hotel hotel) -> {
                // Filtering logic which we want to pass
                return hotel.getPricePerNight() <= 2000;
            });

     3. If you are passing the type to the parameter then, necessary pass the type  for all variable
         Ex:  List<Hotel> hotels = hotelService.filteredHotels((Hotel hotel , int price) -> {

            });

     Rules for function body:
     1. If we only have one line statement we can omit the curly braces & as well as return .
     2. If more than one line then, put curly braces as well as return statement.


 */


