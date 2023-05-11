package com.javapoc.advanced.lambda.hotelmanagement;


public class Hotel {
    private int pricePerNight;
    private double rating;
    public HotelType hotelType;

    public Hotel(int pricePerNight, double rating, HotelType hotelType) {
        this.pricePerNight = pricePerNight;
        this.rating = rating;
        this.hotelType = hotelType;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public double getRating() {
        return rating;
    }

    public HotelType getHotelType() {
        return hotelType;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }

    public String toString() {
        return "Hotel [pricePerNight=" + pricePerNight + " , rating=" + rating + ", hotelType=" + hotelType + " ]";
    }
}

