-- GROUP BY aggregate all rows by specific column often used with functions
-- It clusters the duplicated rows of the specified column (and applies the function to the duplicated entries if there in one)

-- Returns total count (number of duplicate entries) of join date
SELECT join_date, COUNT(*) FROM party
WHERE join_date IS NOT NULL -- Remove any rows without date
GROUP BY join_date;

-- Returns 'join_date' where the average age is greater than the global average age in the party
SELECT join_date, AVG(age) FROM party
GROUP BY join_date
HAVING AVG(age) > (SELECT AVG(age) FROM party); -- Similar to WHERE statement

-- ROLLUP creates another row and aggregates again each function results (super-aggregate values)
SELECT join_date, COUNT(age), AVG(age), MAX(age), MIN(age), SUM(age) FROM party
GROUP BY join_date WITH ROLLUP;