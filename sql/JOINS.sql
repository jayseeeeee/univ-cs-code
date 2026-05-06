-- INNER JOIN shows rows that are present on both tables
SELECT p.name, p.role, s.subject_number, s.powers -- Specific columns to show from either table
FROM party AS p -- Table name alias with 'AS' keyword
INNER JOIN subject AS s
ON p.subject_number = s.subject_number; -- Columns that must match

-- LEFT JOIN shows all rows from original table and matching rows
SELECT p.name, p.role, s.subject_number, s.powers
FROM party AS p -- Source table (every row will show)
LEFT JOIN subject AS s -- Joining table (only matching rows will show)
ON p.subject_number = s.subject_number; -- Columns that must match

-- RIGHT JOIN shows all joining rows and matched original rows
SELECT p.name, p.role, s.subject_number, s.powers -- Specific columns to show from either table
FROM party AS p -- Source table (only matching rows will show)
RIGHT JOIN subject AS s -- Joining table (everything will show)
ON p.subject_number = s.subject_number; -- Columns that must match

