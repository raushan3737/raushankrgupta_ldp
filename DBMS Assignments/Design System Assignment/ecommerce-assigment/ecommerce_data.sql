-- Inserting data into Supplier table
INSERT INTO Supplier (SupplierID, SupplierName, SupplierAddress, SupplierContact)
VALUES
  (1, 'RetailNet', 'Nadia', '9155009435'),
  (2, 'SuperDeals', 'Coimbatore', '9963217820'),
  (3, 'GiftZone', 'Delhi', '9102215947');

-- Inserting  data into Customer table
INSERT INTO Customer (CustomerID, CustomerName, CustomerAddress, CustomerContact)
VALUES
  (1, 'Rahul', 'Patna 800006', '9878963210'),
  (2, 'Manish', 'Kolkata 700052', '7488987433'),
  (3, 'Kunal', 'Rohtas 821304', '9789369214');

-- Inserting data into Item table
INSERT INTO Item (ItemID, ItemName, SupplierID, Price, Quantity)
VALUES
  (1, 'Airpod', 1, 1300, 100),
  (2, 'Bag', 2, 1950, 50),
  (3, 'Shirt', 1, 950, 75),
  (4, 'Cycle', 3,6500, 30);

-- Inserting data into Order table
INSERT INTO Order_details (OrderID, CustomerID, OrderDate, TotalAmount)
VALUES
  (1, 1, '2023-05-15', 29.98),
  (2, 2, '2023-05-16', 39.98),
  (3, 3, '2023-05-17', 74.97);

-- Inserting  data into OrderItem table
INSERT INTO OrderItem (OrderID, ItemID, Quantity)
VALUES
  (1, 1, 2),
  (1, 2, 1),
  (2, 3, 3),
  (3, 4, 2);
