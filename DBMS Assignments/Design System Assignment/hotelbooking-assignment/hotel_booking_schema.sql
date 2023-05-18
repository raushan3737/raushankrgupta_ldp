CREATE DATABASE hotelbooking;
use hotelbooking;

-- Create Hotel table
CREATE TABLE Hotel (
  Hotel_ID INT PRIMARY KEY,
  Hotel_Name VARCHAR(255),
  Location VARCHAR(255)
);

-- Create Customer table
CREATE TABLE Customer (
  Customer_ID INT PRIMARY KEY,
  Customer_Name VARCHAR(255),
  Customer_Address VARCHAR(255)
);

-- Create First Time Customer table (weak entity)
CREATE TABLE First_Time_Customer (
  Customer_ID INT PRIMARY KEY,
  FOREIGN KEY (Customer_ID) REFERENCES Customer (Customer_ID)
);

-- Create Loyal Customer table (weak entity)
CREATE TABLE Loyal_Customer (
  Customer_ID INT PRIMARY KEY,
  FOREIGN KEY (Customer_ID) REFERENCES Customer (Customer_ID)
);

-- Create Hotel Booking table
CREATE TABLE Hotel_Booking (
  Booking_ID INT PRIMARY KEY,
  Customer_ID INT,
  Hotel_ID INT,
  Check_in_Date DATE,
  Check_out_Date DATE,
  FOREIGN KEY (Customer_ID) REFERENCES Customer (Customer_ID),
  FOREIGN KEY (Hotel_ID) REFERENCES Hotel (Hotel_ID)
);
