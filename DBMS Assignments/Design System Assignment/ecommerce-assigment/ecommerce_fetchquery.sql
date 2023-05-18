-- List all the order for a given customer ID

SELECT o.OrderID, o.OrderDate, oi.Quantity, i.ItemName,i.Price
FROM Order_details o
JOIN
  OrderItem oi ON o.OrderID = oi.OrderID
JOIN
  Item i ON oi.ItemID = i.ItemID
WHERE
  o.CustomerID = 1;
 
-- List all order items with associated order and item details:
SELECT
  oi.OrderID, oi.ItemID, oi.Quantity, o.OrderDate, i.ItemName, i.Price
FROM OrderItem oi
JOIN
  Order_details o ON oi.OrderID = o.OrderID
JOIN
  Item i ON oi.ItemID = i.ItemID;
