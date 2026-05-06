-- 'ORDER BY' list rows in order (alphabetically) in ascending or descending manner
SELECT * FROM party
ORDER BY name; -- 'ASC' by default, redundant to add

SELECT * FROM PARTY
ORDER BY name DESC;

SELECT * FROM party
ORDER BY join_date, name; -- Order through 'name' if 'join_date' is the same