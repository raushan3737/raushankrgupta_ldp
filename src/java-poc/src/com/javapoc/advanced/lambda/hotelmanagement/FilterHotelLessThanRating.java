package com.javapoc.advanced.lambda.hotelmanagement;

public class FilterHotelLessThanRating implements HotelFilteringCondition {
    @Override
    public boolean hotelFilteringFunction(Hotel hotel) {
        return hotel.getRating() <= 3;
    }
}
