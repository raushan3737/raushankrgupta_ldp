CREATE DATABASE paytm;
use paytm;

-- Table: Customer
CREATE TABLE Customer (
  customer_id INT PRIMARY KEY,
  customer_name VARCHAR(255),
  customer_address VARCHAR(255)
);


-- Table: Branches
CREATE TABLE Branches (
  branch_id INT PRIMARY KEY,
  branch_name VARCHAR(255),
  branch_address VARCHAR(255)
);


-- Table: Accounts
CREATE TABLE Accounts (
  account_number INT PRIMARY KEY,
  customer_id INT,
  branch_id INT,
  FOREIGN KEY (customer_id) REFERENCES Customer(customer_id),
  FOREIGN KEY (branch_id) REFERENCES Branches(branch_id)
);

