package com.javapoc.advanced.lambda.hotelmanagement;


import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel> hotels = new ArrayList<>();

    public HotelService() {
        hotels.add(new Hotel(2000, 2, HotelType.THREE_STAR));
        hotels.add(new Hotel(1000, 1, HotelType.THREE_STAR));
        hotels.add(new Hotel(20000, 4, HotelType.FIVE_STAR));
        hotels.add(new Hotel(10000, 3.5, HotelType.FOUR_STAR));
    }

//    private boolean isHotelLessThan(int price, Hotel hotel) {
//        return hotel.getPricePerNight() <= price;
//    }
//
//    public List<Hotel> filteredHotelByPrice(int price) {
//        List<Hotel> filteredHotels = new ArrayList<>();
//        for (Hotel hotel : hotels) {
//            if (isHotelLessThan(price, hotel)) {
//                filteredHotels.add(hotel);
//            }
//        }
//        return filteredHotels;
//    }
//
//    private boolean isHotel5Star(Hotel hotel) {
//        return hotel.getHotelType() == HotelType.FIVE_STAR;
//    }
//
//    //Problem: In the future, if any client comes & want new filter feature based on location then , again we have to write the code same as tha above
//    // Here, code is the same as filteredHotelByPrice except the filtered condition (i.e. isHotel5Star) so, instead of repeating the code pass method as parameter to filter
//    public List<Hotel> filteredHotelBy5Star() {
//        List<Hotel> filteredHotels = new ArrayList<>();
//        for (Hotel hotel : hotels) {
//            if (isHotel5Star(hotel)) {
//                filteredHotels.add(hotel);
//            }
//        }
//        return filteredHotels;
//    }


    public List<Hotel> filteredHotels(HotelFilteringCondition filteringCondition) {
        List<Hotel> filteredHotels = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (filteringCondition.hotelFilteringFunction(hotel)) {
                filteredHotels.add(hotel);
            }
        }
        return filteredHotels;
    }
}
