-- Insert data into Train table
INSERT INTO Train (Train_ID, Train_Name, Departure_Time, Arrival_Time)
VALUES
  (1, 'Express 1', '09:00:00', '12:00:00'),
  (2, 'Local 2', '12:30:00', '14:30:00'),
  (3, 'Superfast 3', '15:00:00', '19:00:00');

-- Insert data into Customer table
INSERT INTO Customer (Customer_ID, Customer_Name, Customer_Address)
VALUES
  (1, 'Akash', '123 Patna'),
  (2, 'Satwik', '456 Delhi'),
  (3, 'Rajan', '789 Hyderabad'),
  (4,'Kunal', '512 Barreli');
  
-- Insert data into Ticket table
INSERT INTO Ticket (Ticket_ID, Ticket_Type, Customer_ID, Train_ID)
VALUES
  (1, 'Reserved', 1, 1),
  (2, 'Reserved', 2, 2),
  (3, 'Unreserved', 3, 1),
  (4, 'Unreserved', 4, 3);

-- Insert  data into Reserved Ticket table
INSERT INTO Reserved_Ticket (Ticket_ID)
VALUES(1), (2);

-- Insert data into Unreserved Ticket table
INSERT INTO Unreserved_Ticket (Ticket_ID)
VALUES (3), (4);
