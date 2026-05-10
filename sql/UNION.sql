-- UNION combines the result of two or more SELECT statements

SELECT p.name -- Column in first SELECT statement will always take precedence
FROM party AS p
UNION -- Number of columns in both tables must MATCH
SELECT s.name
FROM subject AS s;

SELECT party_id FROM party
UNION ALL -- Allow duplicates found in both tables
SELECT subject_number FROM subject;