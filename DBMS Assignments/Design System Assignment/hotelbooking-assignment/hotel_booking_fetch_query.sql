-- Query to find loyal customer with hotel name

SELECT cust.Customer_Name, h.Hotel_Name
FROM Loyal_Customer lc
JOIN Customer cust ON lc.Customer_ID = cust.Customer_ID
JOIN Hotel_Booking hb ON cust.Customer_ID = hb.Customer_ID
JOIN Hotel h ON hb.Hotel_ID = h.Hotel_ID;

-- List all first-time customers
SELECT cust.Customer_Name, cust.Customer_Address
FROM Customer cust
JOIN First_Time_Customer ftc ON cust.Customer_ID = ftc.Customer_ID;

-- List all hotel bookings with customer and hotel details
SELECT hb.Booking_ID, cust.Customer_Name, h.Hotel_Name, hb.Check_in_Date, hb.Check_out_Date
FROM Hotel_Booking hb
JOIN Customer cust ON hb.Customer_ID = cust.Customer_ID
JOIN Hotel h ON hb.Hotel_ID = h.Hotel_ID;

-- List all hotel that is not booked on a GIVEN DATE
SELECT *
FROM Hotel
WHERE NOT EXISTS (
  SELECT *
  FROM Hotel_Booking hb
  WHERE hb.Hotel_ID = hotel.Hotel_ID
    AND '2023-05-05' BETWEEN hb.Check_in_Date AND hb.Check_out_Date
);



