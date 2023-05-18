-- Find all account details with branch IDs for a specific customer ID

SELECT Accounts.account_number, Accounts.branch_id, Branches.branch_name, Branches.branch_address
FROM Accounts
JOIN Branches ON Accounts.branch_id = Branches.branch_id
WHERE Accounts.customer_id = 1;
