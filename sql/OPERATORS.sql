-- 'AND' must satisfy both conditions in 'WHERE' statement
SELECT * FROM subject
WHERE is_alive = TRUE AND residence IS NULL;

-- 'OR' must satisfy at least one condition in 'WHERE' statement
SELECT * FROM subject
WHERE subject_number = 11 OR subject_number = 8;

-- 'NOT' must not match the 'WHERE' statement
SELECT * FROM party
WHERE NOT name = 'Will';

-- 'BETWEEN' must have rows match values between two given values (date, time, integer, decimal)
SELECT * FROM party
WHERE party_id BETWEEN 2 AND 4;

-- 'IN' must have values in given set
SELECT * FROM party
WHERE name IN ('Mike', 'Lucas', 'Dustin');

-- Logical operators can be combined together
SELECT * FROM party
WHERE NOT name = 'Will' AND NOT name = 'Eleven';