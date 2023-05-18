-- List all unreserved tickets:
SELECT * FROM Ticket WHERE Ticket_ID IN (SELECT Ticket_ID FROM Unreserved_ticket);

-- List all reserved tickets with their corresponding train and customer information:
SELECT Ticket.*, Tr.Train_Name, Tr.Departure_Time, Tr.Arrival_Time, Cust.Customer_Name, Cust.Customer_Address
FROM Ticket
JOIN Train Tr ON Ticket.Train_ID = Tr.Train_ID
JOIN Customer Cust ON Ticket.Customer_ID = Cust.Customer_ID
WHERE Ticket.Ticket_ID IN (SELECT Ticket_ID FROM Reserved_ticket);

-- List all unreserved tickets with their corresponding customer information:
SELECT Ticket.*, Cust.Customer_Name, Cust.Customer_Address
FROM Ticket 
JOIN Customer Cust ON Ticket.Customer_ID = Cust.Customer_ID
WHERE Ticket.Ticket_ID IN (SELECT Ticket_ID FROM Unreserved_ticket);

-- To find the train name and time for a specific customer, you can use the following SQL query:

SELECT T.Train_Name, T.Departure_Time, T.Arrival_Time
FROM Train T
INNER JOIN Ticket Tk ON T.Train_ID = Tk.Train_ID
INNER JOIN Customer Cust ON Tk.Customer_ID = Cust.Customer_ID
WHERE Cust.Customer_Name = 'Akash';

-- To find the train names and corresponding departure times for all customers
SELECT Cust.Customer_Name, Tr.Train_Name, Tr.Departure_Time
FROM Customer Cust
JOIN Ticket T ON Cust.Customer_ID = T.Customer_ID
JOIN Train Tr ON T.Train_ID = Tr.Train_ID;
