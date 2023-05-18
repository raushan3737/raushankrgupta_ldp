create DATABASE irctc;
use irctc;

-- Create Train table
CREATE TABLE Train (
  Train_ID INT PRIMARY KEY,
  Train_Name VARCHAR(255),
  Departure_Time TIME,
  Arrival_Time TIME
);

-- Create Customer table
CREATE TABLE Customer (
  Customer_ID INT PRIMARY KEY,
  Customer_Name VARCHAR(255),
  Customer_Address VARCHAR(255)
);

-- Create Ticket table
CREATE TABLE Ticket (
  Ticket_ID INT PRIMARY KEY,
  Ticket_Type VARCHAR(20),
  Customer_ID INT,
  Train_ID INT,
  FOREIGN KEY (Customer_ID) REFERENCES Customer (Customer_ID),
  FOREIGN KEY (Train_ID) REFERENCES Train (Train_ID)
);

-- Create Reserved Ticket table (weak entity)
CREATE TABLE Reserved_Ticket (
  Ticket_ID INT PRIMARY KEY,
  FOREIGN KEY (Ticket_ID) REFERENCES Ticket (Ticket_ID)
);

-- Create Unreserved Ticket table (weak entity)
CREATE TABLE Unreserved_Ticket (
  Ticket_ID INT PRIMARY KEY,
  FOREIGN KEY (Ticket_ID) REFERENCES Ticket (Ticket_ID)
);