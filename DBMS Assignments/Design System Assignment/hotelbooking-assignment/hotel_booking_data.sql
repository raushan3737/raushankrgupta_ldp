-- Insert data into Hotel table
INSERT INTO Hotel (Hotel_ID, Hotel_Name, Location)
VALUES
  (1, 'ITC Royal Bengal', 'Kolkata'),
  (2, 'The Austin', 'Delhi'),
  (3, 'Novotel', 'Hyderabad'),
  (4,'Trident', 'Hyderabad'),
  (6,'The Royal Orbit','Jaipur'),
  (5,'The Oberoi Grand','Udaypur');
  

-- Insert  data into Customer table
INSERT INTO Customer (Customer_ID, Customer_Name, Customer_Address)
VALUES
  (1, 'Manish', '123 Delhi'),
  (2, 'Hari om', '456 Mumbai'),
  (3, 'Kunal', '456 Ranchi'),
  (4, 'Hareesh', '456 Asansol'),
  (5, 'Satwik', '789 Patna');

-- Insert data into First Time Customer table
INSERT INTO First_Time_Customer (Customer_ID)
VALUES (1),(3),(5);

-- Insert data into Loyal Customer table
INSERT INTO Loyal_Customer (Customer_ID)
VALUES (4),(2),(3);

-- Insert data into Hotel Booking table
INSERT INTO Hotel_Booking (Booking_ID, Customer_ID, Hotel_ID, Check_in_Date, Check_out_Date)
VALUES
  (101, 1, 1, '2023-05-01', '2023-05-05'),
  (102, 2, 3, '2023-06-10', '2023-06-15'),
  (103, 3, 2, '2023-12-20', '2023-12-25'),
  (104, 4, 4, '2023-08-07', '2023-08-17'),
  (105, 5, 5, '2023-07-20', '2023-07-25');
