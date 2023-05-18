-- Inserting records into the Customer table
INSERT INTO Customer (customer_id, customer_name, customer_address)
VALUES
  (1, 'Kunal', '123 Main St'),
  (2, 'Debjit', '456 Lal bazar'),
  (3, 'Rajan', '789 Newtown');

-- Inserting records into the Branches table
INSERT INTO Branches (branch_id, branch_name, branch_address)
VALUES
  (1, 'Main Branch', '10 Park Ave'),
  (2, 'Downtown Branch', '20 Rice Market'),
  (3, 'West Branch', '30 Lal bazar');


-- Inserting records into the Accounts table
INSERT INTO Accounts (account_number, customer_id, branch_id)
VALUES
  (1, 1, 1),
  (2, 1, 2),
  (3, 2, 1),
  (4, 3, 3);

