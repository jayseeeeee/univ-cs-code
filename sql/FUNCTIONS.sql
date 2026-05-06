-- Built-in Functions — Stored functionality in SQL to pass parameter and get value
-- This is similar to Excel functions

-- Get number of rows in column
SELECT COUNT(*) -- Asterisk (*) means every column and only works in some functions
AS number_of_new_members -- Function creates new column which can be renamed with 'AS' keyword
FROM party
WHERE join_date >= '1981-1-1'; -- Add conditions to 'COUNT' function

-- Get highest value from column
SELECT MAX(join_date)
AS 'Last member join date' -- Use single/double quotation for renaming column with spaces
FROM party;

-- Get lowest value from column
SELECT MIN(join_date)
AS first_member_join_date
FROM party;

-- Get the average/mean value of column
SELECT AVG(age)
AS average_party_age
FROM party;

-- Get the total value of column
SELECT SUM(height)
AS total_subjects_height
FROM subject;

SELECT * FROM subject;

-- Concatenate two columns together as one such as VARCHAR columns
SELECT name, CONCAT(birth_date, ' ', birth_time)
AS birth_event
FROM subject;